/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Ordenador.cpp
 * Author: migue
 * 
 * Created on 27 de febrero de 2020, 10:37
 */

#include "Ordenador.h"
#include<iostream>

Ordenador::Ordenador(float pDisco, float pTarjeta, float pBus, std::string dDisco, std::string dTarjeta, std::string dBus)
{
    d = new Disco(pDisco, dDisco);
    t = new Tarjeta(pTarjeta, dTarjeta);
    b = new Bus(pBus,dBus);
}

void Ordenador::aceptar(VisitantePrecio& V)
{
    b->aceptar(V);
    d->aceptar(V);
    t->aceptar(V);        
}

void Ordenador::aceptar(VisitantePrecioDetalle& V)
{
    b->aceptar(V);
    d->aceptar(V);
    t->aceptar(V);        
}

void Ordenador::mostrar()
{
    std::cout<<"El disco vale: "<<d->getPrecio()<<std::endl;
    std::cout<<"El bus vale: "<<b->getPrecio()<<std::endl;
    std::cout<<"La tarjeta vale: "<<t->getPrecio()<<std::endl;
}