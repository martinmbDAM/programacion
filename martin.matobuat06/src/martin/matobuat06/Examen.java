package martin.matobuat06;

public class Examen {

    final private String respuestas;

    // Constructor que crea un examen con las respuestas correctas:
    Examen(String respuestas_correctas) {
        respuestas = respuestas_correctas;
    }

    float responder(String respuestas_alumno) {

        float nota = 0.0f;

        for (int i = 0; i < respuestas.length(); i++) {

            if (respuestas_alumno.charAt(i) != 'z') {
                if (respuestas.charAt(i) == respuestas_alumno.charAt(i)) {
                    nota += 0.5;
                } else {
                    nota -= 0.2;
                }
            }

        }
        
        // La nota no puede ser inferior a 0:
        if (nota<0){
            nota = 0;
        }
        return (nota);
    }

}
