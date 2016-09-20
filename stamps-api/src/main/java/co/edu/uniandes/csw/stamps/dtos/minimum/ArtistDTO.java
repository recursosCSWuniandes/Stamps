/*
The MIT License (MIT)

Copyright (c) 2015 Los Andes University

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package co.edu.uniandes.csw.stamps.dtos.minimum;

import co.edu.uniandes.csw.stamps.entities.ArtistEntity;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @generated
 */
@XmlRootElement
public class ArtistDTO implements Serializable{

    private Long id;
    private String name;
    private String address;
    private Long telephone;
    private short qualification;
    private Long popularity;
    /**
     * @generated
     */
    public ArtistDTO() {
    }

    /**
     * Crea un objeto ArtistMinimumDTO a partir de un objeto ArtistEntity.
     *
     * @param entity Entidad ArtistEntity desde la cual se va a crear el nuevo objeto.
     * @generated
     */
    public ArtistDTO(ArtistEntity entity) {
	   if (entity!=null){
        this.id=entity.getId();
        this.name=entity.getName();
        this.address=entity.getAddress();
        this.telephone=entity.getTelephone();
        this.qualification=entity.getQualification();
        this.popularity=entity.getPopularity();
       }
    }

    /**
     * Convierte un objeto ArtistMinimumDTO a ArtistEntity.
     *
     * @return Nueva objeto ArtistEntity.
     * @generated
     */
    public ArtistEntity toEntity() {
        ArtistEntity entity = new ArtistEntity();
        entity.setId(this.getId());
        entity.setName(this.getName());
        entity.setAddress(this.getAddress());
        entity.setTelephone(this.getTelephone());
        entity.setQualification(this.getQualification());
        entity.setPopularity(this.getPopularity());
    return entity;
    }

    /**
     * Obtiene el atributo id.
     *
     * @return atributo id.
     * @generated
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el valor del atributo id.
     *
     * @param id nuevo valor del atributo
     * @generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el atributo name.
     *
     * @return atributo name.
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el valor del atributo name.
     *
     * @param name nuevo valor del atributo
     * @generated
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public short getQualification() {
        return qualification;
    }

    public void setQualification(short qualification) {
        this.qualification = qualification;
    }

    public Long getPopularity() {
        return popularity;
    }

    public void setPopularity(Long popularity) {
        this.popularity = popularity;
    }
}
