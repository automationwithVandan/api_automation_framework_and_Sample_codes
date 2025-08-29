package resources;

public class Multi_Layer_JSON_Data 
{
    public static String json_Data_Multi_Layer()
    {
        return "{\r\n"
                + "  \"user\": {\r\n"
                + "    \"id\": 123,\r\n"
                + "    \"name\": \"Aditi Sharma\",\r\n"
                + "    \"contact\": {\r\n"
                + "      \"email\": \"aditi@email.com\",\r\n"
                + "      \"phone\": \"+91-9876543210\",\r\n"
                + "      \"address\": {\r\n"
                + "        \"street\": \"123 MG Road\",\r\n"
                + "        \"city\": \"Delhi\",\r\n"
                + "        \"pincode\": \"110001\"\r\n"
                + "      }\r\n"
                + "    },\r\n"
                + "    \"skills\": [\r\n"
                + "      {\r\n"
                + "        \"name\": \"Java\",\r\n"
                + "        \"level\": \"Expert\"\r\n"
                + "      },\r\n"
                + "      {\r\n"
                + "        \"name\": \"Python\",\r\n"
                + "        \"level\": \"Beginner\"\r\n"
                + "      }\r\n"
                + "    ],\r\n"
                + "    \"company\": {\r\n"
                + "      \"name\": \"Tech Corp\",\r\n"
                + "      \"department\": {\r\n"
                + "        \"name\": \"Engineering\",\r\n"
                + "        \"team\": \"Backend\"\r\n"
                + "      }\r\n"
                + "    }\r\n"
                + "  }\r\n"
                + "}";
    }
}
