package com.upc.appProductos.data;

import com.upc.appProductos.entidades.*;
import com.upc.appProductos.repositorio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private SyllabusRepository syllabusRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    @Autowired
    private SeccionRepository seccionRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private PracticaRepository practicaRepository;

    @Autowired
    private NotaRepository notaRepository;

    @Override
    public void run(String... args) throws Exception {
        // Crear un curso
        Curso curso = new Curso();
        curso.setCodCurso("C001");
        curso.setNombreCurso("Matemáticas");
        cursoRepository.save(curso);

        // Crear un syllabus
        Syllabus syllabus = new Syllabus();
        syllabus.setCodSyllabus("S001");
        syllabus.setDescripcion("Syllabus de Matemáticas");
        syllabus.setAnioSyllabus(2024);
        syllabus.setCurso(curso);
        syllabusRepository.save(syllabus);

        // Crear un profesor
        Profesor profesor = new Profesor();
        profesor.setCodProfesor("P001");
        profesor.setNombreProfesor("Juan");
        profesor.setApePat("Perez");
        profesor.setApeMat("Gomez");
        profesor.setFechaNacimiento("1980-01-01");
        profesor.setAnioContratacion(2010);
        profesorRepository.save(profesor);

        // Crear una sección
        Seccion seccion = new Seccion();
        seccion.setCodSeccion("SEC001");
        seccion.setCurso(curso);
        seccion.setProfesor(profesor);
        seccionRepository.save(seccion);

        // Crear un alumno
        Alumno alumno = new Alumno();
        alumno.setCodAlumno("A001");
        alumno.setNombre("Carlos");
        alumno.setApePat("Rodriguez");
        alumno.setApeMat("Lopez");
        alumno.setFechaNac("2002-05-15");
        alumno.setAnioIngreso(2020);
        alumnoRepository.save(alumno);

        // Crear una práctica
        Practica practica = new Practica();
        practica.setCodPractica("PRA001");
        practica.setPesoPractica(0.2);
        practica.setCurso(curso);
        practicaRepository.save(practica);

        // Crear una nota
        Nota nota = new Nota();
        nota.setAlumno(alumno);
        nota.setPractica(practica);
        nota.setSeccion(seccion);
        nota.setNota(18.5);
        notaRepository.save(nota);
    }
}