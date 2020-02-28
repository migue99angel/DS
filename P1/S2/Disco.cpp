/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Disco.cpp
 * Author: migue
 * 
 * Created on 27 de febrero de 2020, 10:35
 */

#include "Disco.h"
#include "Visitante.h"
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"

Disco::Disco(){}

Disco::Disco(float p, std::string desc)
{
    this->precio = p;
    this->descripcion = desc;
}

void Disco::aceptar(VisitantePrecio& V)
{
    V.visitarDisco(this);
}

void Disco::aceptar(VisitantePrecioDetalle& V)
{
    V.visitarDisco(this);
}


