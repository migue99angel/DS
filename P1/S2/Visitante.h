
/* 
 * File:   Visitante.h
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 *
 * Created on 27 de febrero de 2020, 10:44
 */
#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"
#include "Ordenador.h"



#ifndef VISITANTE_H
#define VISITANTE_H

class Visitante {
public:
    virtual void visitarDisco(Disco* d) = 0;
    virtual void visitarTarjeta(Tarjeta* t) = 0;
    virtual void visitarBus(Bus* b) = 0;
private:

};

#endif /* VISITANTE_H */

