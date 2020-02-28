/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Ordenador.h
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 *
 * Created on 27 de febrero de 2020, 10:37
 */

#ifndef ORDENADOR_H
#define ORDENADOR_H
#include "Disco.h"
#include "Bus.h"
#include "Tarjeta.h"
using namespace std;
class Ordenador {
public:
    Ordenador(float pDisco, float pTarjeta, float pBus, std::string dDisco, std::string dTarjeta, std::string dBus);
    void aceptar(Visitante& V);
    inline Tarjeta* getTarjeta(){return this->t;}
    inline Disco* getDisco(){return this->d;}
    inline Bus* getBus(){return  this->b;}
    void mostrar();
private:
    Disco* d;
    Tarjeta* t;
    Bus* b;

};

#endif /* ORDENADOR_H */

