Serialization and Deserialization in Java 
=====

**Serialization**

Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

Serialization is the conversion of an object to a series of bytes, so that the object can be easily saved to persistent storage or streamed across a communication link. The byte stream can then be deserialized - converted into a replica of the original object.

![Alt text](/serialization_deserialization.png?raw=true "Optional Title")

**Note**

1) Class has to implement Serializable interface

2) ObjectInputStream & ObjectOutputStream classes can be used.

3) readObject & writeObject methods can be used from ObjectInputStream & ObjectOutputStream classes