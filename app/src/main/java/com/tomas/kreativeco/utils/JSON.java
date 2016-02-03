package com.tomas.kreativeco.utils;

/**
 * Created by Tomas on 03/02/2016.
 */
public class JSON
{
        /*
                 Estructuras de datos, que fue proporcionada por ustedes.
                 No se relizo consultas HTTP ya que en el correo me enviaron menciono esto.
                  "No debes hacer nada de 'backend' Solo usar los json que vienen adjuntos en el zip para
                consumirlos de manera local. Lo que buscamos es evaluar como manipulas dichos objetos"

         */
    public static String getJSON_hotel()
    {
        return "{\n" +
                "  \"meta\": {\n" +
                "    \"code\": 200,\n" +
                "    \"requestId\": \"56b0fdab498ebb90b73aebf4\"\n" +
                "  },\n" +
                "  \"response\": {\n" +
                "    \"suggestedFilters\": {\n" +
                "      \"header\": \"Pulsa para mostrar:\",\n" +
                "      \"filters\": [\n" +
                "        {\n" +
                "          \"name\": \"Abierto ahora\",\n" +
                "          \"key\": \"openNow\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"Con promociones\",\n" +
                "          \"key\": \"specials\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    \"suggestedRadius\": 600,\n" +
                "    \"headerLocation\": \"Roma Norte\",\n" +
                "    \"headerFullLocation\": \"Roma Norte, Ciudad de México\",\n" +
                "    \"headerLocationGranularity\": \"neighborhood\",\n" +
                "    \"query\": \"hotel\",\n" +
                "    \"totalResults\": 62,\n" +
                "    \"suggestedBounds\": {\n" +
                "      \"ne\": {\n" +
                "        \"lat\": 19.418684861972533,\n" +
                "        \"lng\": -99.16093752543858\n" +
                "      },\n" +
                "      \"sw\": {\n" +
                "        \"lat\": 19.412369057434912,\n" +
                "        \"lng\": -99.17246651755406\n" +
                "      }\n" +
                "    },\n" +
                "    \"groups\": [\n" +
                "      {\n" +
                "        \"type\": \"Recommended Places\",\n" +
                "        \"name\": \"recommended\",\n" +
                "        \"items\": [\n" +
                "          {\n" +
                "            \"reasons\": {\n" +
                "              \"count\": 0,\n" +
                "              \"items\": [\n" +
                "                {\n" +
                "                  \"summary\": \"Este lugar es popular\",\n" +
                "                  \"type\": \"general\",\n" +
                "                  \"reasonName\": \"globalInteractionReason\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"venue\": {\n" +
                "              \"id\": \"4b0586fcf964a5203f7922e3\",\n" +
                "              \"name\": \"Hotel Roosevelt\",\n" +
                "              \"contact\": {},\n" +
                "              \"location\": {\n" +
                "                \"address\": \"Hotel Roosevelt\",\n" +
                "                \"lat\": 19.41567390279151,\n" +
                "                \"lng\": -99.16587844683119,\n" +
                "                \"distance\": 379,\n" +
                "                \"postalCode\": \"06100\",\n" +
                "                \"cc\": \"MX\",\n" +
                "                \"city\": \"Ciudad de México\",\n" +
                "                \"state\": \"Distrito Federal\",\n" +
                "                \"country\": \"México\",\n" +
                "                \"formattedAddress\": [\n" +
                "                  \"Hotel Roosevelt\",\n" +
                "                  \"06100 Ciudad de México, Distrito Federal\",\n" +
                "                  \"México\"\n" +
                "                ]\n" +
                "              },\n" +
                "              \"categories\": [\n" +
                "                {\n" +
                "                  \"id\": \"4bf58dd8d48988d1fa931735\",\n" +
                "                  \"name\": \"Hotel\",\n" +
                "                  \"pluralName\": \"Hoteles\",\n" +
                "                  \"shortName\": \"Hotel\",\n" +
                "                  \"icon\": {\n" +
                "                    \"prefix\": \"https:\\/\\/ss3.4sqi.net\\/img\\/categories_v2\\/travel\\/hotel_\",\n" +
                "                    \"suffix\": \".png\"\n" +
                "                  },\n" +
                "                  \"primary\": true\n" +
                "                }\n" +
                "              ],\n" +
                "              \"verified\": false,\n" +
                "              \"stats\": {\n" +
                "                \"checkinsCount\": 1147,\n" +
                "                \"usersCount\": 645,\n" +
                "                \"tipCount\": 36\n" +
                "              },\n" +
                "              \"rating\": 7.4,\n" +
                "              \"ratingSignals\": 80,\n" +
                "              \"allowMenuUrlEdit\": true,\n" +
                "              \"photos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"venue\",\n" +
                "                    \"name\": \"Fotos del lugar\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": [\n" +
                "                      {\n" +
                "                        \"id\": \"4f614b5de4b024e6f6e86c02\",\n" +
                "                        \"createdAt\": 1331776349,\n" +
                "                        \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/general\\/\",\n" +
                "                        \"suffix\": \"\\/XVgJ6yZGJKn7WYb4qx5Qq2X5fxdEKU58LBPnKqb-wt0.jpg\",\n" +
                "                        \"width\": 612,\n" +
                "                        \"height\": 612,\n" +
                "                        \"user\": {\n" +
                "                          \"id\": \"7339868\",\n" +
                "                          \"firstName\": \"Alexis\",\n" +
                "                          \"lastName\": \"Garcia\",\n" +
                "                          \"gender\": \"male\",\n" +
                "                          \"photo\": {\n" +
                "                            \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                            \"suffix\": \"\\/NLNGHJ0S4VBCAIPH.jpg\"\n" +
                "                          }\n" +
                "                        },\n" +
                "                        \"visibility\": \"public\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"hereNow\": {\n" +
                "                \"count\": 0,\n" +
                "                \"summary\": \"Nadie aquí\",\n" +
                "                \"groups\": []\n" +
                "              },\n" +
                "              \"featuredPhotos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"items\": [\n" +
                "                  {\n" +
                "                    \"id\": \"4f614b5de4b024e6f6e86c02\",\n" +
                "                    \"createdAt\": 1331776349,\n" +
                "                    \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/general\\/\",\n" +
                "                    \"suffix\": \"\\/XVgJ6yZGJKn7WYb4qx5Qq2X5fxdEKU58LBPnKqb-wt0.jpg\",\n" +
                "                    \"width\": 612,\n" +
                "                    \"height\": 612,\n" +
                "                    \"user\": {\n" +
                "                      \"id\": \"7339868\",\n" +
                "                      \"firstName\": \"Alexis\",\n" +
                "                      \"lastName\": \"Garcia\",\n" +
                "                      \"gender\": \"male\",\n" +
                "                      \"photo\": {\n" +
                "                        \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                        \"suffix\": \"\\/NLNGHJ0S4VBCAIPH.jpg\"\n" +
                "                      }\n" +
                "                    },\n" +
                "                    \"visibility\": \"public\"\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            },\n" +
                "            \"tips\": [\n" +
                "              {\n" +
                "                \"id\": \"50168bf8e4b0649cc2d2675c\",\n" +
                "                \"createdAt\": 1343654904,\n" +
                "                \"text\": \"Hotel barato de excelentes instalaciones, 100% recomendado.\",\n" +
                "                \"type\": \"user\",\n" +
                "                \"canonicalUrl\": \"https:\\/\\/foursquare.com\\/item\\/50168bf8e4b0649cc2d2675c\",\n" +
                "                \"likes\": {\n" +
                "                  \"count\": 5,\n" +
                "                  \"groups\": [],\n" +
                "                  \"summary\": \"5 gustan\"\n" +
                "                },\n" +
                "                \"logView\": true,\n" +
                "                \"todo\": {\n" +
                "                  \"count\": 0\n" +
                "                },\n" +
                "                \"user\": {\n" +
                "                  \"id\": \"1948777\",\n" +
                "                  \"firstName\": \"Ramon\",\n" +
                "                  \"lastName\": \"Gonzalez\",\n" +
                "                  \"gender\": \"male\",\n" +
                "                  \"photo\": {\n" +
                "                    \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                    \"suffix\": \"\\/OEV4IICFEY05UPK3.jpg\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            ],\n" +
                "            \"referralId\": \"e-0-4b0586fcf964a5203f7922e3-0\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"reasons\": {\n" +
                "              \"count\": 0,\n" +
                "              \"items\": [\n" +
                "                {\n" +
                "                  \"summary\": \"Este lugar es popular\",\n" +
                "                  \"type\": \"general\",\n" +
                "                  \"reasonName\": \"globalInteractionReason\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"venue\": {\n" +
                "              \"id\": \"4b0586fdf964a520b47922e3\",\n" +
                "              \"name\": \"Hotel Condesa DF\",\n" +
                "              \"contact\": {\n" +
                "                \"phone\": \"+525552412600\",\n" +
                "                \"formattedPhone\": \"+52 55 5241 2600\",\n" +
                "                \"twitter\": \"grupohabita\",\n" +
                "                \"facebook\": \"261513087297481\",\n" +
                "                \"facebookUsername\": \"GrupoHabitaHotels\",\n" +
                "                \"facebookName\": \"Grupo Habita\"\n" +
                "              },\n" +
                "              \"location\": {\n" +
                "                \"address\": \"Veracruz 102\",\n" +
                "                \"crossStreet\": \"esq. Av. Parque España\",\n" +
                "                \"lat\": 19.416117990368168,\n" +
                "                \"lng\": -99.17194247245789,\n" +
                "                \"distance\": 762,\n" +
                "                \"postalCode\": \"06700\",\n" +
                "                \"cc\": \"MX\",\n" +
                "                \"city\": \"Cuauhtemoc\",\n" +
                "                \"state\": \"Distrito Federal\",\n" +
                "                \"country\": \"México\",\n" +
                "                \"formattedAddress\": [\n" +
                "                  \"Veracruz 102 (esq. Av. Parque España)\",\n" +
                "                  \"06700 Cuauhtémoc, Distrito Federal\",\n" +
                "                  \"México\"\n" +
                "                ]\n" +
                "              },\n" +
                "              \"categories\": [\n" +
                "                {\n" +
                "                  \"id\": \"4bf58dd8d48988d1fa931735\",\n" +
                "                  \"name\": \"Hotel\",\n" +
                "                  \"pluralName\": \"Hoteles\",\n" +
                "                  \"shortName\": \"Hotel\",\n" +
                "                  \"icon\": {\n" +
                "                    \"prefix\": \"https:\\/\\/ss3.4sqi.net\\/img\\/categories_v2\\/travel\\/hotel_\",\n" +
                "                    \"suffix\": \".png\"\n" +
                "                  },\n" +
                "                  \"primary\": true\n" +
                "                }\n" +
                "              ],\n" +
                "              \"verified\": false,\n" +
                "              \"stats\": {\n" +
                "                \"checkinsCount\": 11597,\n" +
                "                \"usersCount\": 6454,\n" +
                "                \"tipCount\": 171\n" +
                "              },\n" +
                "              \"url\": \"http:\\/\\/www.condesadf.com\",\n" +
                "              \"rating\": 8.6,\n" +
                "              \"ratingSignals\": 468,\n" +
                "              \"allowMenuUrlEdit\": true,\n" +
                "              \"photos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"venue\",\n" +
                "                    \"name\": \"Fotos del lugar\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": [\n" +
                "                      {\n" +
                "                        \"id\": \"4da6764640a309f2dd8ad058\",\n" +
                "                        \"createdAt\": 1302754886,\n" +
                "                        \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/general\\/\",\n" +
                "                        \"suffix\": \"\\/NGQZIGNEYCCOPT1JLXZFO0FIGBRHJSPHBT2AGCEEWYP0E134.jpg\",\n" +
                "                        \"width\": 603,\n" +
                "                        \"height\": 540,\n" +
                "                        \"user\": {\n" +
                "                          \"id\": \"6525799\",\n" +
                "                          \"firstName\": \"Fernando\",\n" +
                "                          \"lastName\": \"Avila Ortiz\",\n" +
                "                          \"gender\": \"male\",\n" +
                "                          \"photo\": {\n" +
                "                            \"prefix\": \"https:\\/\\/irs3.4sqi.net\\/img\\/user\\/\",\n" +
                "                            \"suffix\": \"\\/2NMHIFOQVQJ4TH5T.jpg\"\n" +
                "                          }\n" +
                "                        },\n" +
                "                        \"visibility\": \"public\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"hereNow\": {\n" +
                "                \"count\": 0,\n" +
                "                \"summary\": \"Nadie aquí\",\n" +
                "                \"groups\": []\n" +
                "              },\n" +
                "              \"featuredPhotos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"items\": [\n" +
                "                  {\n" +
                "                    \"id\": \"4da6764640a309f2dd8ad058\",\n" +
                "                    \"createdAt\": 1302754886,\n" +
                "                    \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/general\\/\",\n" +
                "                    \"suffix\": \"\\/NGQZIGNEYCCOPT1JLXZFO0FIGBRHJSPHBT2AGCEEWYP0E134.jpg\",\n" +
                "                    \"width\": 603,\n" +
                "                    \"height\": 540,\n" +
                "                    \"user\": {\n" +
                "                      \"id\": \"6525799\",\n" +
                "                      \"firstName\": \"Fernando\",\n" +
                "                      \"lastName\": \"Avila Ortiz\",\n" +
                "                      \"gender\": \"male\",\n" +
                "                      \"photo\": {\n" +
                "                        \"prefix\": \"https:\\/\\/irs3.4sqi.net\\/img\\/user\\/\",\n" +
                "                        \"suffix\": \"\\/2NMHIFOQVQJ4TH5T.jpg\"\n" +
                "                      }\n" +
                "                    },\n" +
                "                    \"visibility\": \"public\"\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            },\n" +
                "            \"flags\": {\n" +
                "              \"outsideRadius\": true\n" +
                "            },\n" +
                "            \"tips\": [\n" +
                "              {\n" +
                "                \"id\": \"4e28746e814df9e4be54627f\",\n" +
                "                \"createdAt\": 1311274094,\n" +
                "                \"text\": \"Ambiente juvenil con gente de 25 años en adelante, donde no es raro ver a intelectuales, políticos o famosos del espectáculo.\",\n" +
                "                \"type\": \"user\",\n" +
                "                \"canonicalUrl\": \"https:\\/\\/foursquare.com\\/item\\/4e28746e814df9e4be54627f\",\n" +
                "                \"likes\": {\n" +
                "                  \"count\": 22,\n" +
                "                  \"groups\": [],\n" +
                "                  \"summary\": \"22 gustan\"\n" +
                "                },\n" +
                "                \"logView\": true,\n" +
                "                \"todo\": {\n" +
                "                  \"count\": 14\n" +
                "                },\n" +
                "                \"user\": {\n" +
                "                  \"id\": \"11760081\",\n" +
                "                  \"firstName\": \"Dónde Ir\",\n" +
                "                  \"gender\": \"none\",\n" +
                "                  \"photo\": {\n" +
                "                    \"prefix\": \"https:\\/\\/irs0.4sqi.net\\/img\\/user\\/\",\n" +
                "                    \"suffix\": \"\\/3DNETFVJZ0LSII1K.png\"\n" +
                "                  },\n" +
                "                  \"type\": \"page\"\n" +
                "                }\n" +
                "              }\n" +
                "            ],\n" +
                "            \"referralId\": \"e-0-4b0586fdf964a520b47922e3-1\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"reasons\": {\n" +
                "              \"count\": 0,\n" +
                "              \"items\": [\n" +
                "                {\n" +
                "                  \"summary\": \"Este lugar es popular\",\n" +
                "                  \"type\": \"general\",\n" +
                "                  \"reasonName\": \"globalInteractionReason\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"venue\": {\n" +
                "              \"id\": \"4bd053b9fb2cce72e4e03bd2\",\n" +
                "              \"name\": \"Hippodrome Hotel\",\n" +
                "              \"contact\": {},\n" +
                "              \"location\": {\n" +
                "                \"address\": \"Av. México 188\",\n" +
                "                \"crossStreet\": \"Sonora\",\n" +
                "                \"lat\": 19.413642780390596,\n" +
                "                \"lng\": -99.16792207778234,\n" +
                "                \"distance\": 258,\n" +
                "                \"cc\": \"MX\",\n" +
                "                \"city\": \"Cuauhtemoc\",\n" +
                "                \"state\": \"Distrito Federal\",\n" +
                "                \"country\": \"México\",\n" +
                "                \"formattedAddress\": [\n" +
                "                  \"Av. México 188 (Sonora)\",\n" +
                "                  \"Cuauhtémoc, Distrito Federal\",\n" +
                "                  \"México\"\n" +
                "                ]\n" +
                "              },\n" +
                "              \"categories\": [\n" +
                "                {\n" +
                "                  \"id\": \"4bf58dd8d48988d1d5941735\",\n" +
                "                  \"name\": \"Bar de hotel\",\n" +
                "                  \"pluralName\": \"Bares de hoteles\",\n" +
                "                  \"shortName\": \"Bar de hotel\",\n" +
                "                  \"icon\": {\n" +
                "                    \"prefix\": \"https:\\/\\/ss3.4sqi.net\\/img\\/categories_v2\\/travel\\/hotel_bar_\",\n" +
                "                    \"suffix\": \".png\"\n" +
                "                  },\n" +
                "                  \"primary\": true\n" +
                "                }\n" +
                "              ],\n" +
                "              \"verified\": true,\n" +
                "              \"stats\": {\n" +
                "                \"checkinsCount\": 224,\n" +
                "                \"usersCount\": 117,\n" +
                "                \"tipCount\": 4\n" +
                "              },\n" +
                "              \"price\": {\n" +
                "                \"tier\": 3,\n" +
                "                \"message\": \"Caro\",\n" +
                "                \"currency\": \"$\"\n" +
                "              },\n" +
                "              \"rating\": 8.1,\n" +
                "              \"ratingSignals\": 13,\n" +
                "              \"allowMenuUrlEdit\": true,\n" +
                "              \"photos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"venue\",\n" +
                "                    \"name\": \"Fotos del lugar\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": [\n" +
                "                      {\n" +
                "                        \"id\": \"53b35c7d498e128f9760460e\",\n" +
                "                        \"createdAt\": 1404263549,\n" +
                "                        \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/general\\/\",\n" +
                "                        \"suffix\": \"\\/51552031_XOFkskri_TI9e2U4sz5AQwTn8FoicaPL5X92fJIaDHg.jpg\",\n" +
                "                        \"width\": 960,\n" +
                "                        \"height\": 540,\n" +
                "                        \"user\": {\n" +
                "                          \"id\": \"51552031\",\n" +
                "                          \"firstName\": \"Ariel\",\n" +
                "                          \"lastName\": \"Rubio\",\n" +
                "                          \"gender\": \"male\",\n" +
                "                          \"photo\": {\n" +
                "                            \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/user\\/\",\n" +
                "                            \"suffix\": \"\\/51552031-BZJSDTCR1NT5OHR2.jpg\"\n" +
                "                          }\n" +
                "                        },\n" +
                "                        \"visibility\": \"public\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"hereNow\": {\n" +
                "                \"count\": 0,\n" +
                "                \"summary\": \"Nadie aquí\",\n" +
                "                \"groups\": []\n" +
                "              },\n" +
                "              \"featuredPhotos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"items\": [\n" +
                "                  {\n" +
                "                    \"id\": \"53b35c7d498e128f9760460e\",\n" +
                "                    \"createdAt\": 1404263549,\n" +
                "                    \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/general\\/\",\n" +
                "                    \"suffix\": \"\\/51552031_XOFkskri_TI9e2U4sz5AQwTn8FoicaPL5X92fJIaDHg.jpg\",\n" +
                "                    \"width\": 960,\n" +
                "                    \"height\": 540,\n" +
                "                    \"user\": {\n" +
                "                      \"id\": \"51552031\",\n" +
                "                      \"firstName\": \"Ariel\",\n" +
                "                      \"lastName\": \"Rubio\",\n" +
                "                      \"gender\": \"male\",\n" +
                "                      \"photo\": {\n" +
                "                        \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/user\\/\",\n" +
                "                        \"suffix\": \"\\/51552031-BZJSDTCR1NT5OHR2.jpg\"\n" +
                "                      }\n" +
                "                    },\n" +
                "                    \"visibility\": \"public\"\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            },\n" +
                "            \"tips\": [\n" +
                "              {\n" +
                "                \"id\": \"53b5faad498eafa2ab38bc04\",\n" +
                "                \"createdAt\": 1404435117,\n" +
                "                \"text\": \"Excelente hotel\",\n" +
                "                \"entities\": [\n" +
                "                  {\n" +
                "                    \"indices\": [\n" +
                "                      10,\n" +
                "                      15\n" +
                "                    ],\n" +
                "                    \"type\": \"search_match\"\n" +
                "                  }\n" +
                "                ],\n" +
                "                \"type\": \"user\",\n" +
                "                \"canonicalUrl\": \"https:\\/\\/foursquare.com\\/item\\/53b5faad498eafa2ab38bc04\",\n" +
                "                \"logView\": true,\n" +
                "                \"todo\": {\n" +
                "                  \"count\": 0\n" +
                "                },\n" +
                "                \"user\": {\n" +
                "                  \"id\": \"89526395\",\n" +
                "                  \"firstName\": \"Israel\",\n" +
                "                  \"lastName\": \"Juárez\",\n" +
                "                  \"gender\": \"male\",\n" +
                "                  \"photo\": {\n" +
                "                    \"prefix\": \"https:\\/\\/irs3.4sqi.net\\/img\\/user\\/\",\n" +
                "                    \"suffix\": \"\\/89526395-QDH43VFV5JFJ3CFU.jpg\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            ],\n" +
                "            \"referralId\": \"e-0-4bd053b9fb2cce72e4e03bd2-2\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"reasons\": {\n" +
                "              \"count\": 0,\n" +
                "              \"items\": [\n" +
                "                {\n" +
                "                  \"summary\": \"Este lugar es popular\",\n" +
                "                  \"type\": \"general\",\n" +
                "                  \"reasonName\": \"globalInteractionReason\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"venue\": {\n" +
                "              \"id\": \"4ca80f6076d3a0932089126b\",\n" +
                "              \"name\": \"Hostal 333\",\n" +
                "              \"contact\": {},\n" +
                "              \"location\": {\n" +
                "                \"address\": \"Colima 333\",\n" +
                "                \"crossStreet\": \"Valladolid\",\n" +
                "                \"lat\": 19.418397779948094,\n" +
                "                \"lng\": -99.16721382941462,\n" +
                "                \"distance\": 695,\n" +
                "                \"cc\": \"MX\",\n" +
                "                \"city\": \"Ciudad de México\",\n" +
                "                \"state\": \"Distrito Federal\",\n" +
                "                \"country\": \"México\",\n" +
                "                \"formattedAddress\": [\n" +
                "                  \"Colima 333 (Valladolid)\",\n" +
                "                  \"Ciudad de México, Distrito Federal\",\n" +
                "                  \"México\"\n" +
                "                ]\n" +
                "              },\n" +
                "              \"categories\": [\n" +
                "                {\n" +
                "                  \"id\": \"4bf58dd8d48988d1fa931735\",\n" +
                "                  \"name\": \"Hotel\",\n" +
                "                  \"pluralName\": \"Hoteles\",\n" +
                "                  \"shortName\": \"Hotel\",\n" +
                "                  \"icon\": {\n" +
                "                    \"prefix\": \"https:\\/\\/ss3.4sqi.net\\/img\\/categories_v2\\/travel\\/hotel_\",\n" +
                "                    \"suffix\": \".png\"\n" +
                "                  },\n" +
                "                  \"primary\": true\n" +
                "                }\n" +
                "              ],\n" +
                "              \"verified\": false,\n" +
                "              \"stats\": {\n" +
                "                \"checkinsCount\": 1200,\n" +
                "                \"usersCount\": 763,\n" +
                "                \"tipCount\": 19\n" +
                "              },\n" +
                "              \"rating\": 8.2,\n" +
                "              \"ratingSignals\": 46,\n" +
                "              \"allowMenuUrlEdit\": true,\n" +
                "              \"hours\": {\n" +
                "                \"isOpen\": false,\n" +
                "                \"isLocalHoliday\": false\n" +
                "              },\n" +
                "              \"photos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"venue\",\n" +
                "                    \"name\": \"Fotos del lugar\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": [\n" +
                "                      {\n" +
                "                        \"id\": \"525bf3df498e2bc0638134eb\",\n" +
                "                        \"createdAt\": 1381757919,\n" +
                "                        \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/general\\/\",\n" +
                "                        \"suffix\": \"\\/4559129_IHt_Kt3rGJoiYQVL6lnwAkAE0NQRL0ImC_PUP73FBtE.jpg\",\n" +
                "                        \"width\": 720,\n" +
                "                        \"height\": 960,\n" +
                "                        \"user\": {\n" +
                "                          \"id\": \"4559129\",\n" +
                "                          \"firstName\": \"eduardo\",\n" +
                "                          \"lastName\": \"calvache\",\n" +
                "                          \"gender\": \"male\",\n" +
                "                          \"photo\": {\n" +
                "                            \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/user\\/\",\n" +
                "                            \"suffix\": \"\\/4559129-0PTCKXCTGCNVLN54.jpg\"\n" +
                "                          }\n" +
                "                        },\n" +
                "                        \"visibility\": \"public\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"hereNow\": {\n" +
                "                \"count\": 0,\n" +
                "                \"summary\": \"Nadie aquí\",\n" +
                "                \"groups\": []\n" +
                "              },\n" +
                "              \"featuredPhotos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"items\": [\n" +
                "                  {\n" +
                "                    \"id\": \"525bf3df498e2bc0638134eb\",\n" +
                "                    \"createdAt\": 1381757919,\n" +
                "                    \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/general\\/\",\n" +
                "                    \"suffix\": \"\\/4559129_IHt_Kt3rGJoiYQVL6lnwAkAE0NQRL0ImC_PUP73FBtE.jpg\",\n" +
                "                    \"width\": 720,\n" +
                "                    \"height\": 960,\n" +
                "                    \"user\": {\n" +
                "                      \"id\": \"4559129\",\n" +
                "                      \"firstName\": \"eduardo\",\n" +
                "                      \"lastName\": \"calvache\",\n" +
                "                      \"gender\": \"male\",\n" +
                "                      \"photo\": {\n" +
                "                        \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/user\\/\",\n" +
                "                        \"suffix\": \"\\/4559129-0PTCKXCTGCNVLN54.jpg\"\n" +
                "                      }\n" +
                "                    },\n" +
                "                    \"visibility\": \"public\"\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            },\n" +
                "            \"flags\": {\n" +
                "              \"outsideRadius\": true\n" +
                "            },\n" +
                "            \"tips\": [\n" +
                "              {\n" +
                "                \"id\": \"51c3d0c7498e4ffa14579d6f\",\n" +
                "                \"createdAt\": 1371787463,\n" +
                "                \"text\": \"Si deseas un lugar en donde te sientas en familia en la Ciudad de Mexico este es el ideal!! Recomendadisimo su restaurante de abajo!! Deliciosa Paella\",\n" +
                "                \"type\": \"user\",\n" +
                "                \"canonicalUrl\": \"https:\\/\\/foursquare.com\\/item\\/51c3d0c7498e4ffa14579d6f\",\n" +
                "                \"likes\": {\n" +
                "                  \"count\": 5,\n" +
                "                  \"groups\": [],\n" +
                "                  \"summary\": \"5 gustan\"\n" +
                "                },\n" +
                "                \"logView\": true,\n" +
                "                \"todo\": {\n" +
                "                  \"count\": 0\n" +
                "                },\n" +
                "                \"user\": {\n" +
                "                  \"id\": \"40728450\",\n" +
                "                  \"firstName\": \"Valentina\",\n" +
                "                  \"lastName\": \"Provitali-umaña\",\n" +
                "                  \"gender\": \"female\",\n" +
                "                  \"photo\": {\n" +
                "                    \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/user\\/\",\n" +
                "                    \"suffix\": \"\\/JSHB0W3LKSPMQ0LG.jpg\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            ],\n" +
                "            \"referralId\": \"e-0-4ca80f6076d3a0932089126b-3\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"reasons\": {\n" +
                "              \"count\": 0,\n" +
                "              \"items\": [\n" +
                "                {\n" +
                "                  \"summary\": \"Este lugar es popular\",\n" +
                "                  \"type\": \"general\",\n" +
                "                  \"reasonName\": \"globalInteractionReason\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"venue\": {\n" +
                "              \"id\": \"514bc35be4b0181e460e2a00\",\n" +
                "              \"name\": \"Roma Amor\",\n" +
                "              \"contact\": {},\n" +
                "              \"location\": {\n" +
                "                \"address\": \"Chiapas 121\",\n" +
                "                \"crossStreet\": \"Tonala\",\n" +
                "                \"lat\": 19.41265613945935,\n" +
                "                \"lng\": -99.16146157053473,\n" +
                "                \"distance\": 471,\n" +
                "                \"postalCode\": \"06700\",\n" +
                "                \"cc\": \"MX\",\n" +
                "                \"city\": \"Ciudad de México\",\n" +
                "                \"state\": \"Distrito Federal\",\n" +
                "                \"country\": \"México\",\n" +
                "                \"formattedAddress\": [\n" +
                "                  \"Chiapas 121 (Tonala)\",\n" +
                "                  \"06700 Ciudad de México, Distrito Federal\",\n" +
                "                  \"México\"\n" +
                "                ]\n" +
                "              },\n" +
                "              \"categories\": [\n" +
                "                {\n" +
                "                  \"id\": \"4bf58dd8d48988d1fb931735\",\n" +
                "                  \"name\": \"Motel\",\n" +
                "                  \"pluralName\": \"Moteles\",\n" +
                "                  \"shortName\": \"Motel\",\n" +
                "                  \"icon\": {\n" +
                "                    \"prefix\": \"https:\\/\\/ss3.4sqi.net\\/img\\/categories_v2\\/travel\\/hotel_\",\n" +
                "                    \"suffix\": \".png\"\n" +
                "                  },\n" +
                "                  \"primary\": true\n" +
                "                }\n" +
                "              ],\n" +
                "              \"verified\": false,\n" +
                "              \"stats\": {\n" +
                "                \"checkinsCount\": 301,\n" +
                "                \"usersCount\": 204,\n" +
                "                \"tipCount\": 18\n" +
                "              },\n" +
                "              \"rating\": 7.9,\n" +
                "              \"ratingSignals\": 55,\n" +
                "              \"allowMenuUrlEdit\": true,\n" +
                "              \"hours\": {\n" +
                "                \"isOpen\": false,\n" +
                "                \"isLocalHoliday\": false\n" +
                "              },\n" +
                "              \"photos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"venue\",\n" +
                "                    \"name\": \"Fotos del lugar\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": [\n" +
                "                      {\n" +
                "                        \"id\": \"5233af7411d2054cdf14c2a4\",\n" +
                "                        \"createdAt\": 1379118964,\n" +
                "                        \"prefix\": \"https:\\/\\/irs0.4sqi.net\\/img\\/general\\/\",\n" +
                "                        \"suffix\": \"\\/23947606_UKKrdp2sBO4hU3UHlWjF9QSmRg81Gwt2wADNPx4QFRY.jpg\",\n" +
                "                        \"width\": 720,\n" +
                "                        \"height\": 960,\n" +
                "                        \"user\": {\n" +
                "                          \"id\": \"23947606\",\n" +
                "                          \"firstName\": \"María Fernanda\",\n" +
                "                          \"gender\": \"female\",\n" +
                "                          \"photo\": {\n" +
                "                            \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                            \"suffix\": \"\\/23947606-U02TJTHN003UOXEP.jpg\"\n" +
                "                          }\n" +
                "                        },\n" +
                "                        \"visibility\": \"public\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"hereNow\": {\n" +
                "                \"count\": 0,\n" +
                "                \"summary\": \"Nadie aquí\",\n" +
                "                \"groups\": []\n" +
                "              },\n" +
                "              \"featuredPhotos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"items\": [\n" +
                "                  {\n" +
                "                    \"id\": \"5233af7411d2054cdf14c2a4\",\n" +
                "                    \"createdAt\": 1379118964,\n" +
                "                    \"prefix\": \"https:\\/\\/irs0.4sqi.net\\/img\\/general\\/\",\n" +
                "                    \"suffix\": \"\\/23947606_UKKrdp2sBO4hU3UHlWjF9QSmRg81Gwt2wADNPx4QFRY.jpg\",\n" +
                "                    \"width\": 720,\n" +
                "                    \"height\": 960,\n" +
                "                    \"user\": {\n" +
                "                      \"id\": \"23947606\",\n" +
                "                      \"firstName\": \"María Fernanda\",\n" +
                "                      \"gender\": \"female\",\n" +
                "                      \"photo\": {\n" +
                "                        \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                        \"suffix\": \"\\/23947606-U02TJTHN003UOXEP.jpg\"\n" +
                "                      }\n" +
                "                    },\n" +
                "                    \"visibility\": \"public\"\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            },\n" +
                "            \"tips\": [\n" +
                "              {\n" +
                "                \"id\": \"55cae22c498e7c0609b7813c\",\n" +
                "                \"createdAt\": 1439359532,\n" +
                "                \"text\": \"El mejor hotel de la zona, super limpio\",\n" +
                "                \"entities\": [\n" +
                "                  {\n" +
                "                    \"indices\": [\n" +
                "                      9,\n" +
                "                      14\n" +
                "                    ],\n" +
                "                    \"type\": \"search_match\"\n" +
                "                  }\n" +
                "                ],\n" +
                "                \"type\": \"user\",\n" +
                "                \"canonicalUrl\": \"https:\\/\\/foursquare.com\\/item\\/55cae22c498e7c0609b7813c\",\n" +
                "                \"logView\": true,\n" +
                "                \"todo\": {\n" +
                "                  \"count\": 0\n" +
                "                },\n" +
                "                \"user\": {\n" +
                "                  \"id\": \"81914153\",\n" +
                "                  \"firstName\": \"Carlos\",\n" +
                "                  \"lastName\": \"Rosales\",\n" +
                "                  \"gender\": \"male\",\n" +
                "                  \"photo\": {\n" +
                "                    \"prefix\": \"https:\\/\\/irs3.4sqi.net\\/img\\/user\\/\",\n" +
                "                    \"suffix\": \"\\/81914153-LJRKQRTE5O1GTEUN.jpg\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            ],\n" +
                "            \"referralId\": \"e-0-514bc35be4b0181e460e2a00-4\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
    }
    public static String getJSON_bar()
    {
        return "{\n" +
                "  \"meta\": {\n" +
                "    \"code\": 200,\n" +
                "    \"requestId\": \"56b0fd44498e836eec2742cf\"\n" +
                "  },\n" +
                "  \"response\": {\n" +
                "    \"suggestedFilters\": {\n" +
                "      \"header\": \"Pulsa para mostrar:\",\n" +
                "      \"filters\": [\n" +
                "        {\n" +
                "          \"name\": \"Con promociones\",\n" +
                "          \"key\": \"specials\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"Abierto ahora\",\n" +
                "          \"key\": \"openNow\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    \"warning\": {\n" +
                "      \"text\": \"No hay muchos resultados para \\\"bar\\\". Prueba algo más general, restablece tus filtros o amplía el área de búsqueda.\"\n" +
                "    },\n" +
                "    \"suggestedRadius\": 600,\n" +
                "    \"headerLocation\": \"Roma Norte\",\n" +
                "    \"headerFullLocation\": \"Roma Norte, Ciudad de México\",\n" +
                "    \"headerLocationGranularity\": \"neighborhood\",\n" +
                "    \"query\": \"bar\",\n" +
                "    \"totalResults\": 273,\n" +
                "    \"suggestedBounds\": {\n" +
                "      \"ne\": {\n" +
                "        \"lat\": 19.41423850198819,\n" +
                "        \"lng\": -99.16403867958526\n" +
                "      },\n" +
                "      \"sw\": {\n" +
                "        \"lat\": 19.409951715816174,\n" +
                "        \"lng\": -99.16752361644039\n" +
                "      }\n" +
                "    },\n" +
                "    \"groups\": [\n" +
                "      {\n" +
                "        \"type\": \"Recommended Places\",\n" +
                "        \"name\": \"recommended\",\n" +
                "        \"items\": [\n" +
                "          {\n" +
                "            \"reasons\": {\n" +
                "              \"count\": 0,\n" +
                "              \"items\": [\n" +
                "                {\n" +
                "                  \"summary\": \"Este lugar es popular\",\n" +
                "                  \"type\": \"general\",\n" +
                "                  \"reasonName\": \"globalInteractionReason\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"venue\": {\n" +
                "              \"id\": \"53bf3ae7498e933c414261e8\",\n" +
                "              \"name\": \"Cantina Riviera del Sur\",\n" +
                "              \"contact\": {\n" +
                "                \"phone\": \"+525567199030\",\n" +
                "                \"formattedPhone\": \"+52 55 6719 9030\",\n" +
                "                \"twitter\": \"cantinariviera\",\n" +
                "                \"facebook\": \"1446498215603211\",\n" +
                "                \"facebookUsername\": \"cantinariviera\",\n" +
                "                \"facebookName\": \"Cantina Riviera\"\n" +
                "              },\n" +
                "              \"location\": {\n" +
                "                \"address\": \"Chiapas 174\",\n" +
                "                \"crossStreet\": \"Medellín\",\n" +
                "                \"lat\": 19.412061080066813,\n" +
                "                \"lng\": -99.16419708580594,\n" +
                "                \"distance\": 184,\n" +
                "                \"postalCode\": \"06700\",\n" +
                "                \"cc\": \"MX\",\n" +
                "                \"neighborhood\": \"Roma Sur\",\n" +
                "                \"city\": \"Roma Sur\",\n" +
                "                \"state\": \"Distrito Federal\",\n" +
                "                \"country\": \"México\",\n" +
                "                \"formattedAddress\": [\n" +
                "                  \"Chiapas 174 (Medellín)\",\n" +
                "                  \"06700 Roma Sur, Distrito Federal\",\n" +
                "                  \"México\"\n" +
                "                ]\n" +
                "              },\n" +
                "              \"categories\": [\n" +
                "                {\n" +
                "                  \"id\": \"4bf58dd8d48988d116941735\",\n" +
                "                  \"name\": \"Bar\",\n" +
                "                  \"pluralName\": \"Bares\",\n" +
                "                  \"shortName\": \"Bar\",\n" +
                "                  \"icon\": {\n" +
                "                    \"prefix\": \"https:\\/\\/ss3.4sqi.net\\/img\\/categories_v2\\/nightlife\\/pub_\",\n" +
                "                    \"suffix\": \".png\"\n" +
                "                  },\n" +
                "                  \"primary\": true\n" +
                "                }\n" +
                "              ],\n" +
                "              \"verified\": false,\n" +
                "              \"stats\": {\n" +
                "                \"checkinsCount\": 6042,\n" +
                "                \"usersCount\": 3558,\n" +
                "                \"tipCount\": 178\n" +
                "              },\n" +
                "              \"price\": {\n" +
                "                \"tier\": 3,\n" +
                "                \"message\": \"Caro\",\n" +
                "                \"currency\": \"$\"\n" +
                "              },\n" +
                "              \"rating\": 8.5,\n" +
                "              \"ratingSignals\": 940,\n" +
                "              \"allowMenuUrlEdit\": true,\n" +
                "              \"hours\": {\n" +
                "                \"status\": \"Cerrado hasta la(s) 13:30\",\n" +
                "                \"isOpen\": false,\n" +
                "                \"isLocalHoliday\": false\n" +
                "              },\n" +
                "              \"photos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"venue\",\n" +
                "                    \"name\": \"Fotos del lugar\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": [\n" +
                "                      {\n" +
                "                        \"id\": \"56abe7dc498ee268276e8c5c\",\n" +
                "                        \"createdAt\": 1454106588,\n" +
                "                        \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/general\\/\",\n" +
                "                        \"suffix\": \"\\/56704160_FdBLn1WR4UxP-mJVRGp1zoEu2Cnw8Hk9QN02U-BoKLI.jpg\",\n" +
                "                        \"width\": 1440,\n" +
                "                        \"height\": 1920,\n" +
                "                        \"user\": {\n" +
                "                          \"id\": \"56704160\",\n" +
                "                          \"firstName\": \"Mirsham\",\n" +
                "                          \"lastName\": \"Martinez\",\n" +
                "                          \"gender\": \"male\",\n" +
                "                          \"photo\": {\n" +
                "                            \"prefix\": \"https:\\/\\/irs0.4sqi.net\\/img\\/user\\/\",\n" +
                "                            \"suffix\": \"\\/56704160-XLKYUK5EKS0OMTVI.jpg\"\n" +
                "                          }\n" +
                "                        },\n" +
                "                        \"visibility\": \"public\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"hereNow\": {\n" +
                "                \"count\": 1,\n" +
                "                \"summary\": \"Una persona más está aquí\",\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"others\",\n" +
                "                    \"name\": \"Otras personas aquí\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": []\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"featuredPhotos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"items\": [\n" +
                "                  {\n" +
                "                    \"id\": \"56abe7dc498ee268276e8c5c\",\n" +
                "                    \"createdAt\": 1454106588,\n" +
                "                    \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/general\\/\",\n" +
                "                    \"suffix\": \"\\/56704160_FdBLn1WR4UxP-mJVRGp1zoEu2Cnw8Hk9QN02U-BoKLI.jpg\",\n" +
                "                    \"width\": 1440,\n" +
                "                    \"height\": 1920,\n" +
                "                    \"user\": {\n" +
                "                      \"id\": \"56704160\",\n" +
                "                      \"firstName\": \"Mirsham\",\n" +
                "                      \"lastName\": \"Martinez\",\n" +
                "                      \"gender\": \"male\",\n" +
                "                      \"photo\": {\n" +
                "                        \"prefix\": \"https:\\/\\/irs0.4sqi.net\\/img\\/user\\/\",\n" +
                "                        \"suffix\": \"\\/56704160-XLKYUK5EKS0OMTVI.jpg\"\n" +
                "                      }\n" +
                "                    },\n" +
                "                    \"visibility\": \"public\"\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            },\n" +
                "            \"tips\": [\n" +
                "              {\n" +
                "                \"id\": \"53d48413498ed4a7a94cc039\",\n" +
                "                \"createdAt\": 1406436371,\n" +
                "                \"text\": \"La contraseña del wifi es 1234567890... Y la torta de cochinita es huérfana..\",\n" +
                "                \"type\": \"user\",\n" +
                "                \"canonicalUrl\": \"https:\\/\\/foursquare.com\\/item\\/53d48413498ed4a7a94cc039\",\n" +
                "                \"likes\": {\n" +
                "                  \"count\": 6,\n" +
                "                  \"groups\": [],\n" +
                "                  \"summary\": \"6 gustan\"\n" +
                "                },\n" +
                "                \"logView\": true,\n" +
                "                \"todo\": {\n" +
                "                  \"count\": 1\n" +
                "                },\n" +
                "                \"user\": {\n" +
                "                  \"id\": \"2754610\",\n" +
                "                  \"firstName\": \"Erick\",\n" +
                "                  \"lastName\": \"Reyes\",\n" +
                "                  \"gender\": \"male\",\n" +
                "                  \"photo\": {\n" +
                "                    \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/user\\/\",\n" +
                "                    \"suffix\": \"\\/2754610-IFURNTCB4ZNBG00L.jpg\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            ],\n" +
                "            \"referralId\": \"e-0-53bf3ae7498e933c414261e8-0\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"reasons\": {\n" +
                "              \"count\": 0,\n" +
                "              \"items\": [\n" +
                "                {\n" +
                "                  \"summary\": \"Este lugar es popular\",\n" +
                "                  \"type\": \"general\",\n" +
                "                  \"reasonName\": \"globalInteractionReason\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"venue\": {\n" +
                "              \"id\": \"4b0586fef964a520137a22e3\",\n" +
                "              \"name\": \"Rioma\",\n" +
                "              \"contact\": {},\n" +
                "              \"location\": {\n" +
                "                \"address\": \"Insurgentes Sur 377\",\n" +
                "                \"lat\": 19.410146569733083,\n" +
                "                \"lng\": -99.1673652102197,\n" +
                "                \"distance\": 279,\n" +
                "                \"postalCode\": \"14000\",\n" +
                "                \"cc\": \"MX\",\n" +
                "                \"city\": \"Ciudad de México\",\n" +
                "                \"state\": \"Distrito Federal\",\n" +
                "                \"country\": \"México\",\n" +
                "                \"formattedAddress\": [\n" +
                "                  \"Insurgentes Sur 377\",\n" +
                "                  \"14000 Ciudad de México, Distrito Federal\",\n" +
                "                  \"México\"\n" +
                "                ]\n" +
                "              },\n" +
                "              \"categories\": [\n" +
                "                {\n" +
                "                  \"id\": \"4bf58dd8d48988d116941735\",\n" +
                "                  \"name\": \"Bar\",\n" +
                "                  \"pluralName\": \"Bares\",\n" +
                "                  \"shortName\": \"Bar\",\n" +
                "                  \"icon\": {\n" +
                "                    \"prefix\": \"https:\\/\\/ss3.4sqi.net\\/img\\/categories_v2\\/nightlife\\/pub_\",\n" +
                "                    \"suffix\": \".png\"\n" +
                "                  },\n" +
                "                  \"primary\": true\n" +
                "                }\n" +
                "              ],\n" +
                "              \"verified\": false,\n" +
                "              \"stats\": {\n" +
                "                \"checkinsCount\": 4548,\n" +
                "                \"usersCount\": 2523,\n" +
                "                \"tipCount\": 52\n" +
                "              },\n" +
                "              \"price\": {\n" +
                "                \"tier\": 2,\n" +
                "                \"message\": \"Moderado\",\n" +
                "                \"currency\": \"$\"\n" +
                "              },\n" +
                "              \"rating\": 8.1,\n" +
                "              \"ratingSignals\": 291,\n" +
                "              \"allowMenuUrlEdit\": true,\n" +
                "              \"photos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"venue\",\n" +
                "                    \"name\": \"Fotos del lugar\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": [\n" +
                "                      {\n" +
                "                        \"id\": \"5130cc5de4b054cc610ed8da\",\n" +
                "                        \"createdAt\": 1362152541,\n" +
                "                        \"prefix\": \"https:\\/\\/irs3.4sqi.net\\/img\\/general\\/\",\n" +
                "                        \"suffix\": \"\\/43111106_60EdCIxu0EU5jjoKomE7JvHokQ72spJdXthms9IcBq8.jpg\",\n" +
                "                        \"width\": 720,\n" +
                "                        \"height\": 960,\n" +
                "                        \"user\": {\n" +
                "                          \"id\": \"43111106\",\n" +
                "                          \"firstName\": \"Mon Cherie\",\n" +
                "                          \"lastName\": \"T.\",\n" +
                "                          \"gender\": \"female\",\n" +
                "                          \"photo\": {\n" +
                "                            \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/user\\/\",\n" +
                "                            \"suffix\": \"\\/DTJH2WMQ3IVB015O.jpg\"\n" +
                "                          }\n" +
                "                        },\n" +
                "                        \"visibility\": \"public\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"hereNow\": {\n" +
                "                \"count\": 0,\n" +
                "                \"summary\": \"Nadie aquí\",\n" +
                "                \"groups\": []\n" +
                "              },\n" +
                "              \"featuredPhotos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"items\": [\n" +
                "                  {\n" +
                "                    \"id\": \"5130cc5de4b054cc610ed8da\",\n" +
                "                    \"createdAt\": 1362152541,\n" +
                "                    \"prefix\": \"https:\\/\\/irs3.4sqi.net\\/img\\/general\\/\",\n" +
                "                    \"suffix\": \"\\/43111106_60EdCIxu0EU5jjoKomE7JvHokQ72spJdXthms9IcBq8.jpg\",\n" +
                "                    \"width\": 720,\n" +
                "                    \"height\": 960,\n" +
                "                    \"user\": {\n" +
                "                      \"id\": \"43111106\",\n" +
                "                      \"firstName\": \"Mon Cherie\",\n" +
                "                      \"lastName\": \"T.\",\n" +
                "                      \"gender\": \"female\",\n" +
                "                      \"photo\": {\n" +
                "                        \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/user\\/\",\n" +
                "                        \"suffix\": \"\\/DTJH2WMQ3IVB015O.jpg\"\n" +
                "                      }\n" +
                "                    },\n" +
                "                    \"visibility\": \"public\"\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            },\n" +
                "            \"tips\": [\n" +
                "              {\n" +
                "                \"id\": \"4f54fd67e4b02d0eb63ee4d1\",\n" +
                "                \"createdAt\": 1330969959,\n" +
                "                \"text\": \"Si estás en la zona centro...sabrás que todos los caminos llevan a Rioma..y en definitivo, after obligado, INDIE GLAM es la regla, llega tarde, no seas claustrofóbico y baila como esquizofrénico.\",\n" +
                "                \"type\": \"user\",\n" +
                "                \"canonicalUrl\": \"https:\\/\\/foursquare.com\\/item\\/4f54fd67e4b02d0eb63ee4d1\",\n" +
                "                \"likes\": {\n" +
                "                  \"count\": 21,\n" +
                "                  \"groups\": [],\n" +
                "                  \"summary\": \"21 gustan\"\n" +
                "                },\n" +
                "                \"logView\": true,\n" +
                "                \"todo\": {\n" +
                "                  \"count\": 19\n" +
                "                },\n" +
                "                \"user\": {\n" +
                "                  \"id\": \"16421782\",\n" +
                "                  \"firstName\": \"Fashion Tequila\",\n" +
                "                  \"gender\": \"none\",\n" +
                "                  \"photo\": {\n" +
                "                    \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                    \"suffix\": \"\\/16421782-L50DS5JNC4PS0SAD.png\"\n" +
                "                  },\n" +
                "                  \"type\": \"page\"\n" +
                "                }\n" +
                "              }\n" +
                "            ],\n" +
                "            \"referralId\": \"e-0-4b0586fef964a520137a22e3-1\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"reasons\": {\n" +
                "              \"count\": 0,\n" +
                "              \"items\": [\n" +
                "                {\n" +
                "                  \"summary\": \"Este lugar es popular\",\n" +
                "                  \"type\": \"general\",\n" +
                "                  \"reasonName\": \"globalInteractionReason\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"venue\": {\n" +
                "              \"id\": \"4b0586fef964a520f57922e3\",\n" +
                "              \"name\": \"Tiki Bar\",\n" +
                "              \"contact\": {},\n" +
                "              \"location\": {\n" +
                "                \"address\": \"Querétaro 227\",\n" +
                "                \"lat\": 19.41404364807128,\n" +
                "                \"lng\": -99.16474342346191,\n" +
                "                \"distance\": 234,\n" +
                "                \"postalCode\": \"76100\",\n" +
                "                \"cc\": \"MX\",\n" +
                "                \"city\": \"Ciudad de México\",\n" +
                "                \"state\": \"Distrito Federal\",\n" +
                "                \"country\": \"México\",\n" +
                "                \"formattedAddress\": [\n" +
                "                  \"Querétaro 227\",\n" +
                "                  \"76100 Ciudad de México, Distrito Federal\",\n" +
                "                  \"México\"\n" +
                "                ]\n" +
                "              },\n" +
                "              \"categories\": [\n" +
                "                {\n" +
                "                  \"id\": \"4bf58dd8d48988d116941735\",\n" +
                "                  \"name\": \"Bar\",\n" +
                "                  \"pluralName\": \"Bares\",\n" +
                "                  \"shortName\": \"Bar\",\n" +
                "                  \"icon\": {\n" +
                "                    \"prefix\": \"https:\\/\\/ss3.4sqi.net\\/img\\/categories_v2\\/nightlife\\/pub_\",\n" +
                "                    \"suffix\": \".png\"\n" +
                "                  },\n" +
                "                  \"primary\": true\n" +
                "                }\n" +
                "              ],\n" +
                "              \"verified\": false,\n" +
                "              \"stats\": {\n" +
                "                \"checkinsCount\": 3929,\n" +
                "                \"usersCount\": 2254,\n" +
                "                \"tipCount\": 55\n" +
                "              },\n" +
                "              \"url\": \"http:\\/\\/tiki.com.mx\",\n" +
                "              \"price\": {\n" +
                "                \"tier\": 2,\n" +
                "                \"message\": \"Moderado\",\n" +
                "                \"currency\": \"$\"\n" +
                "              },\n" +
                "              \"rating\": 7.5,\n" +
                "              \"ratingSignals\": 214,\n" +
                "              \"allowMenuUrlEdit\": true,\n" +
                "              \"hours\": {\n" +
                "                \"isOpen\": false,\n" +
                "                \"isLocalHoliday\": false\n" +
                "              },\n" +
                "              \"photos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"venue\",\n" +
                "                    \"name\": \"Fotos del lugar\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": [\n" +
                "                      {\n" +
                "                        \"id\": \"505d2a5de4b0236a274a3386\",\n" +
                "                        \"createdAt\": 1348282973,\n" +
                "                        \"prefix\": \"https:\\/\\/irs0.4sqi.net\\/img\\/general\\/\",\n" +
                "                        \"suffix\": \"\\/28189194_VUfYqCRNmQUrfRHIPr3V3DAZ5bkheQf8bw2OWg74GdE.jpg\",\n" +
                "                        \"width\": 540,\n" +
                "                        \"height\": 720,\n" +
                "                        \"user\": {\n" +
                "                          \"id\": \"28189194\",\n" +
                "                          \"firstName\": \"Javier\",\n" +
                "                          \"lastName\": \"Flores\",\n" +
                "                          \"gender\": \"male\",\n" +
                "                          \"photo\": {\n" +
                "                            \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                            \"suffix\": \"\\/EL41A1IMU4UKCKHZ.jpg\"\n" +
                "                          }\n" +
                "                        },\n" +
                "                        \"visibility\": \"public\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"hereNow\": {\n" +
                "                \"count\": 0,\n" +
                "                \"summary\": \"Nadie aquí\",\n" +
                "                \"groups\": []\n" +
                "              },\n" +
                "              \"featuredPhotos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"items\": [\n" +
                "                  {\n" +
                "                    \"id\": \"505d2a5de4b0236a274a3386\",\n" +
                "                    \"createdAt\": 1348282973,\n" +
                "                    \"prefix\": \"https:\\/\\/irs0.4sqi.net\\/img\\/general\\/\",\n" +
                "                    \"suffix\": \"\\/28189194_VUfYqCRNmQUrfRHIPr3V3DAZ5bkheQf8bw2OWg74GdE.jpg\",\n" +
                "                    \"width\": 540,\n" +
                "                    \"height\": 720,\n" +
                "                    \"user\": {\n" +
                "                      \"id\": \"28189194\",\n" +
                "                      \"firstName\": \"Javier\",\n" +
                "                      \"lastName\": \"Flores\",\n" +
                "                      \"gender\": \"male\",\n" +
                "                      \"photo\": {\n" +
                "                        \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                        \"suffix\": \"\\/EL41A1IMU4UKCKHZ.jpg\"\n" +
                "                      }\n" +
                "                    },\n" +
                "                    \"visibility\": \"public\"\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            },\n" +
                "            \"tips\": [\n" +
                "              {\n" +
                "                \"id\": \"4d1d4d92f7a9a1437a070f9f\",\n" +
                "                \"createdAt\": 1293766034,\n" +
                "                \"text\": \"El Tiki Bowl es la onda para ponerte una peda de cortador de boletos de la central de camiones de Putla, Oax.\",\n" +
                "                \"type\": \"user\",\n" +
                "                \"canonicalUrl\": \"https:\\/\\/foursquare.com\\/item\\/4d1d4d92f7a9a1437a070f9f\",\n" +
                "                \"likes\": {\n" +
                "                  \"count\": 14,\n" +
                "                  \"groups\": [],\n" +
                "                  \"summary\": \"14 gustan\"\n" +
                "                },\n" +
                "                \"logView\": true,\n" +
                "                \"todo\": {\n" +
                "                  \"count\": 3\n" +
                "                },\n" +
                "                \"user\": {\n" +
                "                  \"id\": \"147165\",\n" +
                "                  \"firstName\": \"Javier\",\n" +
                "                  \"lastName\": \"Rincón\",\n" +
                "                  \"gender\": \"male\",\n" +
                "                  \"photo\": {\n" +
                "                    \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/user\\/\",\n" +
                "                    \"suffix\": \"\\/YHNWBKJG3DSKTEXF.jpg\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            ],\n" +
                "            \"referralId\": \"e-0-4b0586fef964a520f57922e3-2\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
    }
    public static String getJSON_resta()
    {
        return "{\n" +
                "  \"meta\": {\n" +
                "    \"code\": 200,\n" +
                "    \"requestId\": \"56b0fd8c498e5464bd532315\"\n" +
                "  },\n" +
                "  \"response\": {\n" +
                "    \"suggestedFilters\": {\n" +
                "      \"header\": \"Pulsa para mostrar:\",\n" +
                "      \"filters\": [\n" +
                "        {\n" +
                "          \"name\": \"Con promociones\",\n" +
                "          \"key\": \"specials\"\n" +
                "        },\n" +
                "        {\n" +
                "          \"name\": \"Abierto ahora\",\n" +
                "          \"key\": \"openNow\"\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    \"warning\": {\n" +
                "      \"text\": \"No hay muchos resultados para \\\"comida\\\". Prueba algo más general, restablece tus filtros o amplía el área de búsqueda.\"\n" +
                "    },\n" +
                "    \"suggestedRadius\": 600,\n" +
                "    \"headerLocation\": \"Roma Norte\",\n" +
                "    \"headerFullLocation\": \"Roma Norte, Ciudad de México\",\n" +
                "    \"headerLocationGranularity\": \"neighborhood\",\n" +
                "    \"query\": \"comida\",\n" +
                "    \"totalResults\": 242,\n" +
                "    \"suggestedBounds\": {\n" +
                "      \"ne\": {\n" +
                "        \"lat\": 19.414418245862734,\n" +
                "        \"lng\": -99.16609829907202\n" +
                "      },\n" +
                "      \"sw\": {\n" +
                "        \"lat\": 19.411718586077292,\n" +
                "        \"lng\": -99.16929171113912\n" +
                "      }\n" +
                "    },\n" +
                "    \"groups\": [\n" +
                "      {\n" +
                "        \"type\": \"Recommended Places\",\n" +
                "        \"name\": \"recommended\",\n" +
                "        \"items\": [\n" +
                "          {\n" +
                "            \"reasons\": {\n" +
                "              \"count\": 0,\n" +
                "              \"items\": [\n" +
                "                {\n" +
                "                  \"summary\": \"Este lugar es popular\",\n" +
                "                  \"type\": \"general\",\n" +
                "                  \"reasonName\": \"globalInteractionReason\"\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"venue\": {\n" +
                "              \"id\": \"4dc0be6cd4c07bbdf766105c\",\n" +
                "              \"name\": \"Bottega Culinaria\",\n" +
                "              \"contact\": {\n" +
                "                \"phone\": \"+525555643458\",\n" +
                "                \"formattedPhone\": \"+52 55 5564 3458\",\n" +
                "                \"twitter\": \"bottculinaria\",\n" +
                "                \"facebook\": \"146505378783250\",\n" +
                "                \"facebookUsername\": \"bottegaculinaria\",\n" +
                "                \"facebookName\": \"Bottega Culinaria\"\n" +
                "              },\n" +
                "              \"location\": {\n" +
                "                \"address\": \"Av. Sonora 180\",\n" +
                "                \"crossStreet\": \"Av. México\",\n" +
                "                \"lat\": 19.413068415970013,\n" +
                "                \"lng\": -99.16769500510557,\n" +
                "                \"distance\": 204,\n" +
                "                \"postalCode\": \"06100\",\n" +
                "                \"cc\": \"MX\",\n" +
                "                \"city\": \"Cuauhtemoc\",\n" +
                "                \"state\": \"Distrito Federal\",\n" +
                "                \"country\": \"México\",\n" +
                "                \"formattedAddress\": [\n" +
                "                  \"Av. Sonora 180 (Av. México)\",\n" +
                "                  \"06100 Cuauhtémoc, Distrito Federal\",\n" +
                "                  \"México\"\n" +
                "                ]\n" +
                "              },\n" +
                "              \"categories\": [\n" +
                "                {\n" +
                "                  \"id\": \"4bf58dd8d48988d146941735\",\n" +
                "                  \"name\": \"Delicatessen\\/Tienda de comestibles\",\n" +
                "                  \"pluralName\": \"Delicatessen\\/Tiendas de comestibles\",\n" +
                "                  \"shortName\": \"Delicatessen\\/Tienda de comestibles\",\n" +
                "                  \"icon\": {\n" +
                "                    \"prefix\": \"https:\\/\\/ss3.4sqi.net\\/img\\/categories_v2\\/food\\/deli_\",\n" +
                "                    \"suffix\": \".png\"\n" +
                "                  },\n" +
                "                  \"primary\": true\n" +
                "                }\n" +
                "              ],\n" +
                "              \"verified\": true,\n" +
                "              \"stats\": {\n" +
                "                \"checkinsCount\": 12168,\n" +
                "                \"usersCount\": 4906,\n" +
                "                \"tipCount\": 266\n" +
                "              },\n" +
                "              \"url\": \"http:\\/\\/www.bottegaculinaria.com.mx\",\n" +
                "              \"price\": {\n" +
                "                \"tier\": 1,\n" +
                "                \"message\": \"Barato\",\n" +
                "                \"currency\": \"$\"\n" +
                "              },\n" +
                "              \"rating\": 8.9,\n" +
                "              \"ratingSignals\": 810,\n" +
                "              \"allowMenuUrlEdit\": true,\n" +
                "              \"hours\": {\n" +
                "                \"status\": \"Abierto hasta las Medianoche\",\n" +
                "                \"isOpen\": true,\n" +
                "                \"isLocalHoliday\": false\n" +
                "              },\n" +
                "              \"photos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"venue\",\n" +
                "                    \"name\": \"Fotos del lugar\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": [\n" +
                "                      {\n" +
                "                        \"id\": \"5109954be4b0d7bcbf976447\",\n" +
                "                        \"createdAt\": 1359582539,\n" +
                "                        \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/general\\/\",\n" +
                "                        \"suffix\": \"\\/28839679_Whq7dBxvGis1yIARbcWTZGsIbzjScVUtOb5gt3DTXhg.jpg\",\n" +
                "                        \"width\": 652,\n" +
                "                        \"height\": 960,\n" +
                "                        \"user\": {\n" +
                "                          \"id\": \"28839679\",\n" +
                "                          \"firstName\": \"Sabina\",\n" +
                "                          \"lastName\": \"Vasconcelos\",\n" +
                "                          \"gender\": \"female\",\n" +
                "                          \"photo\": {\n" +
                "                            \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                            \"suffix\": \"\\/3YW0NXF2HGY0CWNZ.jpg\"\n" +
                "                          }\n" +
                "                        },\n" +
                "                        \"visibility\": \"public\"\n" +
                "                      }\n" +
                "                    ]\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"hereNow\": {\n" +
                "                \"count\": 1,\n" +
                "                \"summary\": \"Una persona más está aquí\",\n" +
                "                \"groups\": [\n" +
                "                  {\n" +
                "                    \"type\": \"others\",\n" +
                "                    \"name\": \"Otras personas aquí\",\n" +
                "                    \"count\": 1,\n" +
                "                    \"items\": []\n" +
                "                  }\n" +
                "                ]\n" +
                "              },\n" +
                "              \"featuredPhotos\": {\n" +
                "                \"count\": 1,\n" +
                "                \"items\": [\n" +
                "                  {\n" +
                "                    \"id\": \"5109954be4b0d7bcbf976447\",\n" +
                "                    \"createdAt\": 1359582539,\n" +
                "                    \"prefix\": \"https:\\/\\/irs1.4sqi.net\\/img\\/general\\/\",\n" +
                "                    \"suffix\": \"\\/28839679_Whq7dBxvGis1yIARbcWTZGsIbzjScVUtOb5gt3DTXhg.jpg\",\n" +
                "                    \"width\": 652,\n" +
                "                    \"height\": 960,\n" +
                "                    \"user\": {\n" +
                "                      \"id\": \"28839679\",\n" +
                "                      \"firstName\": \"Sabina\",\n" +
                "                      \"lastName\": \"Vasconcelos\",\n" +
                "                      \"gender\": \"female\",\n" +
                "                      \"photo\": {\n" +
                "                        \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                        \"suffix\": \"\\/3YW0NXF2HGY0CWNZ.jpg\"\n" +
                "                      }\n" +
                "                    },\n" +
                "                    \"visibility\": \"public\"\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            },\n" +
                "            \"tips\": [\n" +
                "              {\n" +
                "                \"id\": \"4f39e981e4b05a15695a59e3\",\n" +
                "                \"createdAt\": 1329195393,\n" +
                "                \"text\": \"Las papas con chilito que están en la caja están con madre\",\n" +
                "                \"type\": \"user\",\n" +
                "                \"canonicalUrl\": \"https:\\/\\/foursquare.com\\/item\\/4f39e981e4b05a15695a59e3\",\n" +
                "                \"likes\": {\n" +
                "                  \"count\": 14,\n" +
                "                  \"groups\": [],\n" +
                "                  \"summary\": \"14 gustan\"\n" +
                "                },\n" +
                "                \"logView\": true,\n" +
                "                \"todo\": {\n" +
                "                  \"count\": 1\n" +
                "                },\n" +
                "                \"user\": {\n" +
                "                  \"id\": \"9877171\",\n" +
                "                  \"firstName\": \"Memo\",\n" +
                "                  \"lastName\": \"Cano\",\n" +
                "                  \"gender\": \"male\",\n" +
                "                  \"photo\": {\n" +
                "                    \"prefix\": \"https:\\/\\/irs2.4sqi.net\\/img\\/user\\/\",\n" +
                "                    \"suffix\": \"\\/GGA5C5HYS0RQSMOQ.jpg\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            ],\n" +
                "            \"referralId\": \"e-0-4dc0be6cd4c07bbdf766105c-0\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";
    }
}
