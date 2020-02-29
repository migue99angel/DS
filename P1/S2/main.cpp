/* 
 * File:   main.cpp
 * Author: Miguel Ángel Posadas
 * Author: Francisco Dominguez
 *
 * Created on 27 de febrero de 2020, 10:22
 */
#include<iostream>
#include "Ordenador.h"
#include <sstream>
#include "VisitantePrecio.h"
#include "VisitantePrecioDetalle.h"
#include "Estudiante.h"
#include "Mayorista.h"
using namespace std;

/*
 * 
 */
int main(int argc, char** argv)
{
    Persona p = Persona();
    Estudiante est = Estudiante();
    Mayorista mar = Mayorista();
    
    VisitantePrecio Vprecio = VisitantePrecio();
    VisitantePrecioDetalle Vdetalle = VisitantePrecioDetalle();
    
    Ordenador* pc1 = new Ordenador(5,10,15,"Disco duro mecánico SANDISK", "TP-LINK hasta 100Mb/s", "Bus de datos INTEL");
    Ordenador* pc2 = new Ordenador(15,20,20,"SSD SAMSUNG 128Gb", "TP-LINK hasta 600Mb/s", "Bus de datos AMD");
    
    pc1->aceptar(Vprecio,p);
    pc1->aceptar(Vdetalle,p);
    
    cout<<"El VisitantePrecio obtiene que el precio del pc1 es: "<<Vprecio.getCoste()<<" euros, para un cliente sin ningún tipo de descuento"<<endl;
    Vdetalle.resultado();
    cout<<endl<<endl;
    
    Vprecio.limpiar();
    Vdetalle.limpiar();
    
    pc1->aceptar(Vprecio,est);
    pc1->aceptar(Vdetalle,est);
    
    cout<<"El VisitantePrecio obtiene que el precio del pc1 es: "<<Vprecio.getCoste()<<" euros, para un estudiante"<<endl;
    Vdetalle.resultado();
    cout<<endl<<endl;
    
    Vprecio.limpiar();
    Vdetalle.limpiar();
    
    pc1->aceptar(Vprecio,mar);
    pc1->aceptar(Vdetalle,mar);
    
    cout<<"El VisitantePrecio obtiene que el precio del pc1 es: "<<Vprecio.getCoste()<<" euros, para un mayorista"<<endl;
    Vdetalle.resultado();
    cout<<endl<<endl;
    
    Vprecio.limpiar();
    Vdetalle.limpiar();
    
    pc2->aceptar(Vprecio,p);
    pc2->aceptar(Vdetalle,p);

    cout<<"El VisitantePrecio obtiene que el precio del pc2 es: "<<Vprecio.getCoste()<<" euros, para un cliente sin ningún tipo de descuento"<<endl;
    Vdetalle.resultado();
    cout<<endl<<endl;
    
    Vprecio.limpiar();
    Vdetalle.limpiar();
    
    pc2->aceptar(Vprecio,est);
    pc2->aceptar(Vdetalle,est);

    cout<<"El VisitantePrecio obtiene que el precio del pc2 es: "<<Vprecio.getCoste()<<" euros, para un estudiante"<<endl;
    Vdetalle.resultado();
    cout<<endl<<endl;
    
    Vprecio.limpiar();
    Vdetalle.limpiar();
    
    pc2->aceptar(Vprecio,mar);
    pc2->aceptar(Vdetalle,mar);

    cout<<"El VisitantePrecio obtiene que el precio del pc2 es: "<<Vprecio.getCoste()<<" euros, para un estudiante"<<endl;
    Vdetalle.resultado();
    cout<<endl<<endl;
}

