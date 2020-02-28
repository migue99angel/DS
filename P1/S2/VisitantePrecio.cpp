/* 
 * File:   VisitantePrecio.cpp
 * Author: migue
 * 
 * Created on 27 de febrero de 2020, 10:47
 */

#include "VisitantePrecio.h"

VisitantePrecio::VisitantePrecio()
{
    this->limpiar();
}

void VisitantePrecio::visitarBus(Bus* b)
{
    this->coste += b->getPrecio();
}

void VisitantePrecio::visitarDisco(Disco* d)
{
    this->coste += d->getPrecio();
}

void VisitantePrecio::visitarTarjeta(Tarjeta* t)
{
    this->coste += t->getPrecio();
}

