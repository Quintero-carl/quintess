package com.quintess.quintess.quintess;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;



@Service
public class QuintessService {

    public Map<Integer, List<Quintess>> getQuintess(){
                List<Quintess> Jugadores = new ArrayList<>(Arrays.asList());
                        Jugadores.add (new Quintess( 37, "Claudio Bravo"));
                        Jugadores.add (new Quintess(36, "Jean Beausejour"));
                        Jugadores.add (new Quintess(33, "Gary Medel"));
                        Jugadores.add (new Quintess(32, "Mauricio Isla"));
                        Jugadores.add (new Quintess(31, "Charles Aránguiz"));
                        Jugadores.add (new Quintess(34, "Gonzalo Jara"));
                        Jugadores.add (new Quintess(33, "Arturo Vidal"));
                        Jugadores.add (new Quintess(34, "Matias Fernandez"));
                        Jugadores.add (new Quintess(36, "Jorge Valdivia"));
                        Jugadores.add (new Quintess(31, "Alexis Sánchez"));
                        Jugadores.add (new Quintess(30, "Eduardo Vargas"));


                        Map<Integer, List<Quintess>> grouped =
                                Jugadores.stream()
                                        .collect(
                                                Collectors.groupingBy(
                                                        Quintess -> Quintess.getAge()
                                                )
                                        );

                        return  grouped;



    }
}
