Primitive type          Wrapper class       Example of constructing
boolean                 Boolean             new Boolean(true)
byte                    Byte                new Byte((byte) 1)
short                   Short               new Short((short) 1)
int                     Integer             new Integer(1)
long                    Long                new Long(1)
float                   Float               new Float(1.0)
double                  Double              new Double(1.0)
char                    Character           new Character('c')

Converting from a String

Wrapper class   to primitive                    to wrapper class
Boolean         Boolean.parseBoolean("true");   Boolean.valueOf("TRUE");
Byte            Byte.parseByte("1");            Byte.valueOf("2");
Short           Short.parseShort("1");          Short.valueOf("2");
Integer         Integer.parseInt("1");          Integer.valueOf("2");
Long            Long.parseLong("1");            Long.valueOf("2");
Float           Float.parseFloat("1");          Float.valueOf("2.2");
Double          Double.parseDouble("1");        Double.valueOf("2.2");
Character       None                            None
