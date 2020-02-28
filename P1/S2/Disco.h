
/* 
 * File:   Disco.h
 * Author: migue
 *
 * Created on 27 de febrero de 2020, 10:35
 */

#ifndef DISCO_H
#define DISCO_H
#include "ComponenteEquipo.h"
class Disco : public ComponenteEquipo{
public:
    Disco();
    Disco(float p, std::string desc);
    void aceptar(VisitantePrecio& V);
    void aceptar(VisitantePrecioDetalle& V);
private:

};

#endif /* DISCO_H */

