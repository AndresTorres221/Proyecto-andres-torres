# diagrama de estados


USUARIO           PANTALLA (HTML)       CONTROLADOR (Java)       SERVICIO (Lógica)         BASE DE DATOS
   │                     │                       │                       │                       │
   │──(Llena datos y)───►│                       │                       │                       │
   │  (clic en Guardar)  │                       │                       │                       │
   │                     │───(Petición POST)────►│                       │                       │
   │                     │                       │                       │                       │
   │                     │                       │──(Valida que no)──┐   │                       │
   │                     │                       │  (haya vacíos  )──┘   │                       │
   │                     │                       │                       │                       │
   │                     │                       │───(Llama a guardar)──►│                       │
   │                     │                       │                       │───(Busca por ID)─────►│
   │                     │                       │                       │◄──(Devuelve datos)────│
   │                     │                       │                       │                       │
   │                     │                       │                       │───(Guarda detalle)───►│
   │                     │                       │                       │◄──(Confirmación)──────│
   │                     │                       │◄──(Proceso terminado)─│                       │
   │                     │                       │                       │                       │
   │                     │◄──(Redirecciona a)────│                       │                       │
   │                     │   (tabla actualizada) │                       │                       │
   │◄──(Muestra página)──│                       │                       │                       │
   │   (con el registro) │                       │                       │                       │