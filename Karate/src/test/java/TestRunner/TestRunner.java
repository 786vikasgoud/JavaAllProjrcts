package TestRunner;

import com.intuit.karate.junit5.Karate;

public class TestRunner {
    @Karate.Test
    Karate getAPI_TEST(){
        return Karate.run("classpath:High_level_implementations_FeatureFile/booksoperation.feature").relativeTo(getClass());
    }
    @Karate.Test
    Karate Generating_the_BearerTokenTests(){
        return Karate.run("classpath:FeatureFile/Generating_the_BearerToken.feature").relativeTo(getClass());
    }
    @Karate.Test
    Karate sampleTests(){
        return Karate.run("classpath:FeatureFile/sample.feature").relativeTo(getClass());
    }
    @Karate.Test
    Karate path_paramsTests(){
        return Karate.run("classpath:FeatureFile/path_params.feature").relativeTo(getClass());
    }
    @Karate.Test
    Karate Query_parametersTests(){
        return Karate.run("classpath:FeatureFile/Query_parameters.feature").relativeTo(getClass());
    }
    @Karate.Test
    Karate ReadDataFrom_JSONTests(){
        return Karate.run("classpath:FeatureFile/ReadDataFrom_JSON.feature").relativeTo(getClass());
    }
   // @Karate.Test
    Karate post_requestTests(){
        return Karate.run("classpath:FeatureFile/post_request.feature").relativeTo(getClass());
    }

}
