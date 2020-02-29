/* 
 * File:   VisitantePrecio.cpp
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 * 
 * Created on 27 de febrero de 2020, 10:47
 */

#include "VisitantePrecio.h"

VisitantePrecio::VisitantePrecio()
{
    this->limpiar();
}

void VisitantePrecio::visitarBus(Bus* b, Persona& P)
{
    this->coste += b->getPrecio()*P.getDescuento();
}

void VisitantePrecio::visitarDisco(Disco* d, Persona& P)
{
    this->coste += d->getPrecio()*P.getDescuento();
}

void VisitantePrecio::visitarTarjeta(Tarjeta* t, Persona& P)
{
    this->coste += t->getPrecio()*P.getDescuento();
}

