
/* 
 * File:   Visitante.h
 * Author: migue
 *
 * Created on 27 de febrero de 2020, 10:44
 */
#include "Disco.h"
#include "Tarjeta.h"
#include "Bus.h"



#ifndef VISITANTE_H
#define VISITANTE_H

class Visitante {
public:
    Visitante();
    void visitarDisco(Disco d);
    void visitarTarjeta(Tarjeta t);
    void visitarBus(Bus b);
private:

};

#endif /* VISITANTE_H */

