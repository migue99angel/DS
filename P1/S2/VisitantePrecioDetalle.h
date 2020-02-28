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
    void visitarDisco(Disco* d);
    void visitarTarjeta(Tarjeta* t);
    void visitarBus(Bus* b);
    void limpiar();
    void resultado();
private:
    pair<int,std::string> disco;
    pair<int,std::string> tarjeta;
    pair<int,std::string> bus;

};

#endif /* VISITANTEPRECIODETALLE_H */

