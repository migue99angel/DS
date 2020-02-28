/* 
 * File:   Bus.cpp
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 * 
 * Created on 27 de febrero de 2020, 10:31
 */

#include "Bus.h"
#include "Visitante.h"
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"

Bus::Bus(){}

Bus::Bus(float p, std::string desc)
{
    this->precio = p;
    this->descripcion = desc;
}

void Bus::aceptar(Visitante& V)
{
    V.visitarBus(this);
}
