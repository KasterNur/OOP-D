Overview 
       why we need object to encapsulate everthing in class
          class include: 
                        - data     -> means properties/fields/atributes
                        - behavior -> means functions
          More important is how to manage those "object's relatinship" in between any objets in our target system.
              -- "is a" relatinship
                    -- Inheritance 
              -- "has a" relationsip
                    --aggregation
                    --compositions          
Today:
       1).continue to Ploymorphism
             override equals and hashcode from java.lang.Object 
             
             equals():
                     if you overide equals has to be override hashCode(), why?
                            -hash-based collections
                                   -hashTable
                                   -hashSet
                                   -hashMap
                            - JDK7 java.util.Objects.hash() function and PrimeNumber 31
       2) Abstract class
                    
