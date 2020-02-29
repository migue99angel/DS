/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Persona.cpp
 * Author: migue
 * 
 * Created on 29 de febrero de 2020, 12:45
 */

#include "Persona.h"

Persona::Persona()
{
    //Las personas que no son ni estudiantes ni mayoristas no tienen descuento
    this->descuento = 1;
}

float Persona::getDescuento()
{
    return this->descuento;
}



