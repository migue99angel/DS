module PrototipoRuby
  class FactoriaCarretera
    include FactoriaCarreraYBicicleta
    
    def crearCarrera(id)
      return CarreraCarretera.new(id)
    end
    
    def crearBicicleta(id)
      return BicicletaCarretera.new(id)
    end
  end
end
