(function (ng) {
    var mod = ng.module('roleModule', ['ngCrud']);
    mod.controller('roleCtrl', ['$rootScope', 'Restangular','$state', function ($rootScope, Restangular) {

        $rootScope.auth = function () {
                Restangular.all("users").customGET('me').then(function (response) {
                    if (response == null) {
                        $rootScope.category = false;
                        $rootScope.artist = false;
                        $rootScope.client = false;
                        $rootScope.tShirt = false;
                        $rootScope.authenticated = false;
                    } else {
                        $rootScope.authenticated = true;
                        var roles = $rootScope.roles = response.roles;
                        var isFreelance = false;
                        if (roles.indexOf("client") !== -1) {
                            isFreelance = true;
                            $rootScope.category = false;
                            $rootScope.artist = false;
                            $rootScope.client = true;
                            $rootScope.tShirt = false;
                        }
                        if (roles.indexOf("artist") !== -1) {
                            $rootScope.category = false;
                            $rootScope.artist = true;
                            $rootScope.client = false;
                            $rootScope.tShirt = false;
                        }
                        if (roles.indexOf("admin") !== -1) {
                            $rootScope.category = true;
                            $rootScope.artist = true;
                            $rootScope.client = true;
                            $rootScope.tShirt = true;
                        }
                    }
                });
            };
        $rootScope.auth();
        $rootScope.$on('logged-in', function () {
            $rootScope.auth();
            if ($rootScope.roles.indexOf("admin") !== -1) {
                $rootScope.category = true;
                $rootScope.artist = true;
                $rootScope.client = true;
                $rootScope.tShirt = true;
            }
        });

        $rootScope.$on('logged-out', function () {
            $rootScope.auth();
        });
    }]);
})(window.angular);




