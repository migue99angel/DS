require './carrera_montana.rb'
require './bicicleta_montana.rb'

module PrototipoRuby
  class FactoriaMontana
    
    def crearCarrera(id)
      return CarreraMontana.new(id)
    end
    
    def crearBicicleta(id)
      return BicicletaMontana.new(id)
    end
  end
end
