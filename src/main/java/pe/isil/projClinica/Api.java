package pe.isil.projClinica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

//tu vas a ser un Rest controller
@RestController
//modo que voy a acceder a tus metodos es por la ruta de acá:
@RequestMapping("/api/dev/")
public class Api {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EspecialidadRepository especialidadRepository;

    @GetMapping("/get-usuarios")
    public List<Usuario> getUse(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/add-usuario")
    public ResponseEntity<HashMap<String, String>> addUser(){
        HashMap<String, String> resp = new HashMap<>();
        try {
            Usuario usuario = new Usuario();
            usuario.setNombre("Margaret");
            usuario.setApellido("Montana");
            usuario.setEmail("margaret@gmail.com");
            usuario.setContra("565423");

            usuarioRepository.save(usuario);

            resp.put("codigo","200");
            resp.put("mensaje",String.format("Usuario creada correctamente",usuario.getNombre()));

            return ResponseEntity.ok(resp);

        }catch (Exception e){
            resp.put("codigo","500");
            return ResponseEntity.internalServerError().body(resp);
        }
    }

    @GetMapping("/add-especialidad")
    public ResponseEntity<HashMap<String, String>> addUse(){
        HashMap<String, String> resp = new HashMap<>();
        try {
            Especialidad especialidad = new Especialidad();
            especialidad.setNombreEspecialidad("Cardiología");

            especialidadRepository.save(especialidad);

            resp.put("codigo","200");
            resp.put("mensaje",String.format("Especialidad %s creada correctamente",especialidad.getNombreEspecialidad()));

            return ResponseEntity.ok(resp);

        }catch (Exception e){
            resp.put("codigo","500");
            return ResponseEntity.internalServerError().body(resp);
        }
    }


/*
@GetMapping("/get-pacientes")
    public List<Paciente> getPac(){
        Paciente paciente = new Paciente();
        paciente.setNombrePaciente("Carlos");
        paciente.setApelliPaciente("Alvarado");
        paciente.setNumdocPaciente("44271238");
        paciente.setFechanUsuario("31051987");
        paciente.setSexoPaciente("Masculino");
        paciente.setTelefoPaciente("31051987");
        paciente.setEmailPacienteo("31051987");
        paciente.setSeguroPaciente("31051987");
        paciente.setDireccPaciente("31051987");
        return List.of(paciente);
    }


    @GetMapping("")
    public String index(){
        return "Método con ruta vacía";
    }

    @GetMapping("medico")
    public String medico(){
        return "Hello World";
    }

    @GetMapping("/paciente")
    public String paciente(){
        return "Hello World222";
    }

    @GetMapping({"especialidad", "chau"})
    public String especialidad(){
        return "Hello World222";
    }

    @GetMapping({"hola", "chau"})
    public String citaMedica(){
        return "Hello World222";
    }
*/
}
