/* 
 * File:   VisitantePrecioDetalle.h
 * Author: migue
 *
 * Created on 27 de febrero de 2020, 10:51
 */

#ifndef VISITANTEPRECIODETALLE_H
#define VISITANTEPRECIODETALLE_H
#include "Visitante.h"
class VisitantePrecioDetalle {
public:
    VisitantePrecioDetalle();
    void visitarDisco(Disco d);
    void visitarTarjeta(Tarjeta t);
    void visitarBus(Bus b);
private:

};

#endif /* VISITANTEPRECIODETALLE_H */

