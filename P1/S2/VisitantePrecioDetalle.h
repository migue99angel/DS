/* 
 * File:   VisitantePrecioDetalle.h
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 *
 * Created on 27 de febrero de 2020, 10:51
 */

#ifndef VISITANTEPRECIODETALLE_H
#define VISITANTEPRECIODETALLE_H
#include "Visitante.h"
class VisitantePrecioDetalle : public Visitante {
public:
    VisitantePrecioDetalle();
    void visitarDisco(Disco* d, Persona& P);
    void visitarTarjeta(Tarjeta* t, Persona& P);
    void visitarBus(Bus* b, Persona& P);
    void limpiar();
    void resultado();
private:
    pair<double,std::string> disco;
    pair<double,std::string> tarjeta;
    pair<double,std::string> bus;
    double coste = 0;

};

#endif /* VISITANTEPRECIODETALLE_H */

