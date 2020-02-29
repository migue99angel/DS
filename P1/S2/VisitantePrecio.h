/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   VisitantePrecio.h
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 *
 * Created on 27 de febrero de 2020, 10:47
 */

#ifndef VISITANTEPRECIO_H
#define VISITANTEPRECIO_H
#include "Visitante.h"
class VisitantePrecio : public Visitante {
public:
    VisitantePrecio();
    void visitarDisco(Disco* d, Persona& P);
    void visitarTarjeta(Tarjeta* t, Persona& P);
    void visitarBus(Bus* b, Persona& P);
    inline float getCoste(){return coste;}
    inline void limpiar(){this->coste = 0;}
private:
    float coste;
        
};

#endif /* VISITANTEPRECIO_H */

