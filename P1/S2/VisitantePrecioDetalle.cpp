/* 
 * File:   VisitantePrecioDetalle.cpp
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 * 
 * Created on 27 de febrero de 2020, 10:51
 */

#include "VisitantePrecioDetalle.h"
#include <iostream>

VisitantePrecioDetalle::VisitantePrecioDetalle()
{
    limpiar();
}

void VisitantePrecioDetalle::visitarBus(Bus* b,Persona& P)
{
    this->bus.first = b->getPrecio() * P.getDescuento();
    this->bus.second = b->getDescripcion();
    this->coste += this->bus.first;
}

void VisitantePrecioDetalle::visitarDisco(Disco* d, Persona& P)
{
    this->disco.first = d->getPrecio()* P.getDescuento();
    this->disco.second = d->getDescripcion();
    this->coste += this->disco.first;
}

void VisitantePrecioDetalle::visitarTarjeta(Tarjeta* t, Persona& P)
{
    this->tarjeta.first = t->getPrecio()* P.getDescuento();
    this->tarjeta.second = t->getDescripcion();
    this->coste += this->tarjeta.first;
}

void VisitantePrecioDetalle::limpiar()
{
    this->disco.first = 0;
    this->disco.second = "";
    this->tarjeta.first = 0;
    this->tarjeta.second = "";
    this->bus.first = 0;
    this->bus.second = "";
    this->coste = 0;
}

void VisitantePrecioDetalle::resultado()
{
    std::cout<<"El equipo visitado dispone de los siguientes componentes: "<<std::endl;
    std::cout<<"Una tarjeta de red con la siguiente descripción: "<<this->tarjeta.second<<". Con un valor de: "<<this->tarjeta.first<<" euros"<<std::endl;
    std::cout<<"Un disco con la siguiente descripción: "<<this->disco.second<<". Con un valor de: "<<this->disco.first<<" euros"<<std::endl;
    std::cout<<"Un bus de datos con la siguiente descripción: "<<this->bus.second<<". Con un valor de: "<<this->bus.first<<" euros"<<std::endl;
    std::cout<<"En total el equipo tiene un coste de: "<<this->coste<<" euros";
}