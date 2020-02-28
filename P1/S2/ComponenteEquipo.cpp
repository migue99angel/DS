/* 
 * File:   ComponenteEquipo.cpp
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 * 
 * Created on 27 de febrero de 2020, 10:28
 */

#include "ComponenteEquipo.h"
#include "Visitante.h"

ComponenteEquipo::ComponenteEquipo(){}

ComponenteEquipo::ComponenteEquipo(float p, std::string desc)
{
    this->precio = p;
    this->descripcion = desc;
}



