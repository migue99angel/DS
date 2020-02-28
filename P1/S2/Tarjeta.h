/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Tarjeta.h
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 *
 * Created on 27 de febrero de 2020, 10:34
 */

#ifndef TARJETA_H
#define TARJETA_H
#include "ComponenteEquipo.h"

class Tarjeta : public ComponenteEquipo {
public:
    Tarjeta();
    Tarjeta(float p, std::string desc);
    void aceptar(Visitante& V);
private:

};

#endif /* TARJETA_H */

