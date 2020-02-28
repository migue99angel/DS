/* 
 * File:   ComponenteEquipo.h
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 *
 * Created on 27 de febrero de 2020, 10:28
 */

#ifndef COMPONENTEEQUIPO_H
#define COMPONENTEEQUIPO_H

#include <string>


class Visitante;
class VisitantePrecio;
class VisitantePrecioDetalle;
class ComponenteEquipo {
public:
    ComponenteEquipo();
    ComponenteEquipo(float p , std::string desc );
    virtual void aceptar(Visitante& V) = 0;
    inline int getPrecio(){return precio;}
    inline std::string getDescripcion(){return descripcion;}
protected:
    float precio;
    std::string descripcion;
};

#endif /* COMPONENTEEQUIPO_H */

