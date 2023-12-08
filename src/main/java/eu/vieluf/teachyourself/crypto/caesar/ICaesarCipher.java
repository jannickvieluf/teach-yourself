package eu.vieluf.teachyourself.crypto.caesar;

public interface ICaesarCipher {

    String encrypt(String plain);

    String decrypt(String cipherText);
}
