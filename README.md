# SAFETYNET_ALERTS
A SafetyNet application

## CRUD RESTFull API Documentation

Endpoint person Stack :

| API           | HTTP   | PATH                 | Status Code     | Description                                           |
|---------------|--------|----------------------|-----------------|-------------------------------------------------------|
| GET persons   | GET    | /api/v1/persons      | 200(OK)         | Renvoi la liste de toutes les personnes (format Json) |
| POST person   | POST   | /api/v1/persons      | 201(Created)    | Création d'une nouvelle personne                      |
| GET person    | GET    | /api/v1/persons/{id} | 200(ok)         | Renvoi les informations d'une personne                |
| PUT person    | PUT    | /api/v1/persons/{id} | 200(ok)         | Mets à jour les informations d'une personne           |
| DELETE person | DELETE | /api/v1/persons/{id} | 204(no content) | Suppression d'une personne                            |

Endpoint firestations Stack :

| API                | HTTP   | PATH                      | Status Code     | Description                                             |
|--------------------|--------|---------------------------|-----------------|---------------------------------------------------------|
| GET firestations   | GET    | /api/v1/firestations      | 200(OK)         | Renvoi la liste de toutes les firestations(format Json) |
| POST firestation   | POST   | /api/v1/firestations      | 201(Created)    | Création d'une nouvelle firestation                     |
| GET firestation    | GET    | /api/v1/firestations/{id} | 200(ok)         | Renvoi les informations d'une firestation               |
| PUT firestation    | PUT    | /api/v1/firestations/{id} | 200(ok)         | Mets à jour les informations d'une firestation          |
| DELETE firestation | DELETE | /api/v1/firestations/{id} | 204(no content) | Suppression d'une firestation                           |

Endpoint medicalrecords Stack :

| API                  | HTTP   | PATH                        | Status Code     | Description                                               |
|----------------------|--------|-----------------------------|-----------------|-----------------------------------------------------------|
| GET medicalrecords   | GET    | /api/v1/medicalrecords      | 200(OK)         | Renvoi la liste de toutes les medicalrecords(format Json) |
| POST medicalrecord   | POST   | /api/v1/medicalrecords      | 201(Created)    | Création d'une nouvelle medicalrecord                     |
| GET medicalrecord    | GET    | /api/v1/medicalrecords/{id} | 200(ok)         | Renvoi les informations d'une medicalrecord               |
| PUT medicalrecord    | PUT    | /api/v1/medicalrecords/{id} | 200(ok)         | Mets à jour les informations d'une medicalrecord          |
| DELETE medicalrecord | DELETE | /api/v1/medicalrecords/{id} | 204(no content) | Suppression d'une medicalrecord                           |

