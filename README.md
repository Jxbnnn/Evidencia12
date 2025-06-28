# DIAGRAMA UML  

**Integrantes:**  
- Alonso Lagos  
- Benjamin Urrea  
- Francisca Aguayo  

Modelo de clases generado en VisualParadigm (images/VISUAL PARADIGM.jpeg)





### **Código utilizado en VisualParadigm**  
```plantuml
@startuml  
package modelo {  

  abstract class PrevisionSalud {  
    - nombre: String  
    - porcentaje: double  
    + getNombre(): String  
    + getPorcentaje(): double  
  }  

  class Fonasa {  
    + Fonasa()  
  }  

  class Isapre {  
    + Isapre(nombre: String, porcentaje: double)  
  }  

  class AFP {  
    - nombre: String  
    - porcentaje: double  
    + getNombre(): String  
    + getPorcentaje(): double  
  }  

  class Persona {  
    - nombre: String  
    - apellido: String  
    - rut: String  
    + getNombre(): String  
    + getApellido(): String  
    + getRut(): String  
  }  

  class Trabajador {  
    - previsionSalud: PrevisionSalud  
    - afp: AFP  
    + getPrevisionSalud(): PrevisionSalud  
    + getAfp(): AFP  
  }  

  PrevisionSalud <|-- Fonasa  
  PrevisionSalud <|-- Isapre  
  Persona <|-- Trabajador  
  Trabajador --> PrevisionSalud  
  Trabajador --> AFP  
}  
@enduml  
