
/* 
 * File:   Disco.cpp
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
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

void Disco::aceptar(Visitante& V, Persona& P)
{
    V.visitarDisco(this,P);
}

