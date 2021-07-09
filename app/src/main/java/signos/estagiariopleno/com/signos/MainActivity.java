package signos.estagiariopleno.com.signos;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;
import java.util.StringTokenizer;

public class MainActivity extends Activity {

    //Lista de signos
    private String [] signos = {"Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer",
                                "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio"};
    //Declaração dos componentes
    private ListView items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera as ID's
        items = (ListView) findViewById(R.id.itemsId);

        //Adapta o conteúdo da array para a ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos
        );

        //Seta a array para ListView
        items.setAdapter(adapter);


        /* -----------------------------------EVENTOS-----------------------------------*/

        //Evento de clique nos itens da ListView
        items.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String descricao = getDescricaoSigno(items.getItemAtPosition(i).toString());
                Toast.makeText(getApplicationContext(),descricao,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String getDescricaoSigno(String descricao){
        if (descricao.equals("Aquário")){ descricao="Aquário gosta de: Diversão com os amigos, ajudar os outros, lutar por causas, conversa intelectual, um bom ouvinte";}
        if (descricao.equals("Peixes")) { descricao="Peixes gosta de: Ficar sozinho, dormir, música, romance, meios visuais, natação, temas espirituais";}
        if (descricao.equals("Áries"))  { descricao="Áries gosta de: Roupas confortáveis, assumir papéis de liderança, desafios físicos, esportes individuais";}
        if (descricao.equals("Touro"))  { descricao="Touro gosta de: Jardinagem, culinária, música, romance, roupas de alta qualidade, trabalhar com as mãos";}
        if (descricao.equals("Gêmeos")) { descricao="Gêmeos gosta de: Música, livros, revistas, bate-papos, viagens curtas em torno da cidade";}
        if (descricao.equals("Câncer")) { descricao="Câncer gosta de: Arte, passatempos caseiros, relaxar perto ou dentro da água, ajudar seus entes queridos, uma boa refeição com amigos";}
        if (descricao.equals("Leão")){ descricao="Leão gosta de: Teatro, tirar férias, ser admirado, coisas caras, cores brilhantes, diversão com os amigos";}
        if (descricao.equals("Virgem")) { descricao="Virgem gosta de: Animais, alimentação saudável, livros, natureza, limpeza";}
        if (descricao.equals("Libra")){ descricao="Libra gosta de: Harmonia, mansidão, compartilhar com outras pessoas, ar livre";}
        if (descricao.equals("Escorpião")){ descricao="Escorpião gosta de: Verdade, fatos, estar certo, amigos de longa data, provocação, grandes paixões";}
        if (descricao.equals("Sagitário")){ descricao="Sagitário gosta de: Liberdade, viagens, filosofia, estar ao ar livre";}
        if (descricao.equals("Capricórnio")){ descricao="Capricórnio gosta de: Família, tradição, música, discrição, artesanato de qualidade";}

        return descricao;
    }
}
