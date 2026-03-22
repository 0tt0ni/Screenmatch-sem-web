package br.com.filype.Screenmatch.service;

import br.com.filype.Screenmatch.Model.DadosSerie;
import tools.jackson.databind.ObjectMapper;

public class ConverteDados  implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obterdados(String json, Class<T> classe) {

            return mapper.readValue(json, classe);


    }
}
