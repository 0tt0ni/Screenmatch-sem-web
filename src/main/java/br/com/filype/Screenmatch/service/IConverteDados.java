package br.com.filype.Screenmatch.service;

public interface IConverteDados {
    <T> T obterdados(String json, Class<T> classe);
}
