/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Ordenador.h
 * Author: migue
 *
 * Created on 27 de febrero de 2020, 10:37
 */

#ifndef ORDENADOR_H
#define ORDENADOR_H
#include "ComponenteEquipo.h"
#include <vector>
using namespace std;
class Ordenador {
public:
    Ordenador();
private:
    vector<ComponenteEquipo> equipo;
};

#endif /* ORDENADOR_H */

