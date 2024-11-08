
package postgres.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela PESSOA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"PESSOA\"", schema="\"public\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("postgres.entity.Pessoa")
@CronappTable(role=CronappTableRole.AUTO)
public class Pessoa implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="INTEGER", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.Integer id;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Genero")
    @Column(name = "genero", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String genero;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Name")
    @Column(name = "name", nullable = true, unique = false, length=255, insertable=true, updatable=true)
        
        private java.lang.String name;


    /**
    * Construtor
    * @generated
    */
    public Pessoa(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.Integer getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Pessoa setId(java.lang.Integer id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém genero
    * return genero
    * @generated
    */
    public java.lang.String getGenero() {
        return this.genero;
    }

    /**
    * Define genero
    * @param genero genero
    * @generated
    */
    public Pessoa setGenero(java.lang.String genero) {
        this.genero = genero;
        return this;
    }
    /**
    * Obtém name
    * return name
    * @generated
    */
    public java.lang.String getName() {
        return this.name;
    }

    /**
    * Define name
    * @param name name
    * @generated
    */
    public Pessoa setName(java.lang.String name) {
        this.name = name;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pessoa object = (Pessoa)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}