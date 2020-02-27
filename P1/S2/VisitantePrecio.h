/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VisitantePrecio.h
 * Author: migue
 *
 * Created on 27 de febrero de 2020, 10:47
 */

#ifndef VISITANTEPRECIO_H
#define VISITANTEPRECIO_H
#include "Visitante.h"
class VisitantePrecio : public Visitante {
public:
    VisitantePrecio();
    void visitarDisco(Disco d);
    void visitarTarjeta(Tarjeta t);
    void visitarBus(Bus b);
private:

};

#endif /* VISITANTEPRECIO_H */

