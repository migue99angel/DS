require './carrera_carretera.rb'
require './bicicleta_carretera.rb'

module PrototipoRuby
  class FactoriaCarretera
    
    def crearCarrera(id)
      return CarreraCarretera.new(id)
    end
    
    def crearBicicleta(id)
      return BicicletaCarretera.new(id)
    end
  end
end
