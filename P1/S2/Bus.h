/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Bus.h
 * Author: migue
 *
 * Created on 27 de febrero de 2020, 10:31
 */

#ifndef BUS_H
#define BUS_H
#include "ComponenteEquipo.h"
class Bus: public ComponenteEquipo {
public:
    Bus();
    Bus(float p, std::string desc);
    void aceptar(VisitantePrecio& V);
    void aceptar(VisitantePrecioDetalle& V);
private:

};

#endif /* BUS_H */

