package com.grupo2.jump2hackathon.documents;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.json.JsonObject;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "barrio")
public class Barrio {
    private UUID uuid;
    private String codiBarri;
    private String nomBarri;
    private String codiDistricte;
    private String nomDistricte;
    private Poligono poligono;
    @Field(name= "naltres")
    private Integer nAltres;
    @Field(name= "nautomocio")
    private Integer nAutomocio;
    @Field(name= "nequipamentPersonal")
    private Integer nEquipamentPersonal;
    @Field(name= "nlocalBuit")
    private Integer nLocalBuit;
    @Field(name= "nociCultura")
    private Integer nOciCultura;
    @Field(name= "nparamentLlar")
    private Integer nParamentLlar;
    @Field(name= "nquotidiaAlimentari")
    private Integer nQuotidiaAlimentari;
    @Field(name= "nquotidiaNoAlimentari")
    private Integer nQuotidiaNoAlimentari;
    @Field(name= "nserveis")
    private Integer nServeis;
}
