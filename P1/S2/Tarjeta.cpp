/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Tarjeta.cpp
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 * 
 * Created on 27 de febrero de 2020, 10:34
 */

#include "Tarjeta.h"
#include "Visitante.h"
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"

Tarjeta::Tarjeta(){}

Tarjeta::Tarjeta(float p, std::string desc)
{
    this->precio = p;
    this->descripcion = desc;
}

void Tarjeta::aceptar(Visitante& V, Persona& P)
{
    V.visitarTarjeta(this,P);
}