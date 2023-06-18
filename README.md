# splivros
Uma API REST feita com Java e Spring Boot que disponibiliza uma lista de livros cuja ordem pode ser modificada.

### Dependências

- Spring Boot

```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-jpa</artifactId>
	</dependency>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-test</artifactId>
	<scope>test</scope>
</dependency>
```

- Banco de dados H2 (perfil test)

```xml
<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>
```

- Banco de dados PostgreSQL (perfil dev)

```xml
<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>
```

### Diagrama com as classes principais do projeto

![diagrama](src/main/resources/images/diagrama_classes.png)

### Seed dos dados para as tabelas TB_LIVRO, TB_LIVRO_LIST e TB_PERTENCE

```sql
INSERT INTO TB_LIVRO_LIST (nome) VALUES ('Literatura infanto-juvenil');
INSERT INTO TB_LIVRO_LIST (nome) VALUES ('Literatura adulta');

INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('12 regras para a vida: um antídoto para o caos', 'Crescimento Pessoal e Inspiração Religião e Espiritualidade', 'Jordan B. Peterson', 'Português', 'Alta Books', 448, 'Aclamado psicólogo clínico, Jordan Peterson tem influenciado a compreensão moderna sobre a personalidade e, agora, se transformou em um dos pensadores públicos mais populares do mundo, com suas palestras sobre tópicos que variam da bíblia, às relações amorosas e à mitologia, atraindo dezenas de milhões de espectadores. Em uma era de mudanças sem precedentes e polarização da política, sua mensagem franca e revigorante sobre o valor da responsabilidade individual e da sabedoria ancestral tem ecoado em todos os cantos do mundo. Neste livro, ele oferece doze princípios profundos e práticos sobre como viver uma vida com significado. A partir de exemplos vívidos de sua prática clínica e vida pessoal, bem como de lições extraídas das histórias e mitos mais antigos da humanidade, 12 Regras para a Vida oferece um antídoto para o caos em nossas vidas: verdades eternas aplicadas aos nossos problemas modernos.', 'https://m.media-amazon.com/images/I/41XbfSiYscL._SX348_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('Rita Lee: Outra autobiografia', 'Artistas Individuais', 'Rita Lee', 'Português', 'Globo Livros', 192, 'Rita pode ter tido de tudo, menos uma vidinha besta. E os últimos anos foram, sim, desafiadores. Ao mesmo tempo que o mundo passava por uma pandemia, ela foi diagnosticada com câncer no pulmão. Em um texto franco, ora cru e chocante, ora cheio de ironias, ora sutil e amoroso, Rita Lee não poupa detalhes de seu tratamento. Fala também da rotina, dos avisos do Universo, de seres de luz e dos caminhos que a vida tomou. Com franqueza e honestidade ― marcas registradas de sua escrita ―, ela pariu um novo livro autobiográfico que vai mexer profundamente com o leitor. Nossa compositora maior está, sem dúvida, no panteão literário entre os grandes escritores. Ao nos entregar este livro, Rita é tomada de uma coragem que só não é superior ao amor que tem por seu público. Afinal, ela quis contar a ele, tim-tim por tim-tim, o que se passou. Viva Rita!', 'https://m.media-amazon.com/images/I/51VIERsohGL._SX348_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('Mo Dao Zu Shi: O Fundador da Cultivação Demoníaca', 'Fantasia de Ação e Aventura', 'Mo Xiang Tong Xiu', 'Português', 'NewPOP', 488, 'Deixando um rastro de destruição, o Clã Wen segue em frente. Depois do ataque ao Píer Lótus, Jiang Cheng e Wei Wuxian tomam decisões que ficarão para sempre marcadas em suas histórias. Enquanto dolorosos acontecimentos são revelados e mistérios são desvendados, nesse volume, a história se desenha para seu arco final. E, mais uma vez, Wei Wuxian tem que enfrentar o mundo da cultivação, mas dessa vez não está mais sozinho.', 'https://m.media-amazon.com/images/I/610ChEinfNL._SX370_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('O Encanamento que Geme', 'Mangá HQs, Mangás e Graphic Novels', 'Junji Ito', 'Português', 'Pipoca e Nanquim', 404, 'Até onde vai a fixação de alguém? A mãe de Reina e Mari Shimizué aficionada por limpeza, a ponto de querer cada canto da casa sem nem uma manchinha e exigir que as filhas tomem muitos banhos ao longo dia. Então, ela é apresentada a Numei, um garoto sujo que é apaixonado por Reina. Não apenas apaixonado, mas aficionado! E o que acontece quando duas fixações descontroladas se chocam? Esse é o pano de fundo de O Encanamento que Geme, história que serve como título desta coletânea, e que é, declaradamente, uma das favoritas do seu autor. E este é um volume de fixações. Um grupo de estudantes vidrados em assuntos paranormais. Uma misteriosa mulher que enfiou na cabeça que tudo e todos querem evitá-la. Um pai de família maníaco por marionetes. Uma viúva decidida a seguir com o experimento do falecido marido. Uma garota que dá mais atenção do que devia a pequenos problemas... Personagens cujas tramas estão entre as mais agonizantes de Junji Ito.', 'https://m.media-amazon.com/images/I/61jWDjrtGOL._SX354_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('Panelinha receitas que funcionam', 'Gastronomia e Culinária', 'Rita Lobo', 'Português', 'Senac São Paulo', 480, 'Você já deve ter ouvido falar no Panelinha da Rita Lobo, né? Do ano 2000 até aqui ele ganhou um estilo ainda mais inovador, mantendo a mesma essência de ensinar a cozinhar de forma simples e acessível e sem ultraprocessados. Com mais de 550 receitas, este livro reúne toda essa experiência para ajudar você a ganhar autonomia e manter uma alimentação saudável e saborosa em todas as refeições.', 'https://m.media-amazon.com/images/I/61j-ls12SrL._SX714_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('The Legend of Zelda(tm) Tears of the Kingdom - The Complete Official Guide: Collector Edition', 'Programação de Jogo de Computadores', 'Piggyback', 'Inglês', 'Piggyback Interactive', 496, 'The Legend of Zelda: Tears of the Kingdom offers a vast world full of varied quests, challenging puzzles, ferocious monsters, and unique sights to behold. Working closely with Nintendo(R), we have created the authoritative, all-encompassing guide that this game so richly deserves. We have explored all features and facets of The Legend of Zelda: Tears of the Kingdom with a single mission: to help you discover and enjoy every moment of this game.', 'https://m.media-amazon.com/images/I/51ZLFV0ZBwL._SX375_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('Eu, Dragão: a Saga', 'Fantasia em Graphic Novels', 'Juan Giménez', 'Português', 'Comix Zone', 192, 'Enquanto nos preparamos para celebrar o aniversário do Rei Belmonth com grande pompa, o castelo de Rosentall vive seus momentos mais sombrios. Um poderoso exército de mercenários liderados por uma mulher misteriosa está avançando. Pior ainda: os tremores cada vez mais frequentes do vulcão Ferona sugerem que a própria calamidade celestial, Madragon, está de volta. No meio desse caos, uma trupe de artistas itinerantes, no qual uma criança está prestes a nascer, pode mudar o destino do reino... Referência máxima da história em quadrinhos de ficção científica, Juan Giménez está no auge de sua arte ao se aventurar pelas terras mágicas da fantasia heroica. Respeitando de forma magnífica os códigos do gênero, o desenhista de A Casta dos Metabarões presenteia os leitores com uma grande epopeia onde se entrelaçam lutas de poder, rivalidades familiares, batalhas épicas e criaturas fantásticas.', 'https://m.media-amazon.com/images/I/51Vl7Vmc36L._SX363_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('Modernidade líquida', 'Sociologia', 'Zygmunt Bauman', 'Português', 'Zahar', 223, 'Zygmunt Bauman cumpre aqui sua missão de sociólogo, esclarecendo como se deu a transição da modernidade e nos auxiliando a repensar os conceitos e esquemas cognitivos usados para descrever a experiência individual humana e sua história conjunta. É a essa tarefa que se dedica este livro. Analisando cinco conceitos básicos que organizam a vida em sociedade — emancipação, individualidade, tempo/espaço, trabalho e comunidade —, Bauman traça suas sucessivas formas e mudanças de significado. Modernidade líquida complementa e conclui a análise realizada pelo autor em Globalização: As consequências humanas e Em busca da política. Juntos, esses três volumes formam uma análise brilhante das condições cambiantes da vida social e política', 'https://m.media-amazon.com/images/I/31cNUG91WDS.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('Arendt: Entre o amor e o mal: uma biografia', 'Biografia', 'Ann Heberlein', 'Português', 'Companhia das Letras', 256, 'A vida de Hannah Arendt se estende por um período imprescindível na história do mundo ocidental, que abrange não apenas a ascensão do regime nazista e as crises da Guerra Fria, mas a formulação de reflexões fundamentais sobre o valor e a culpa da humanidade diante desses episódios. Nesse sentido, suas contribuições intelectuais estão diretamente relacionadas à sua vida, marcada por experiências terríveis, mas também por amor, exílio e saudade. Em Arendt, Ann Heberlein oferece um retrato inédito que trata desde os temas políticos caros à autora que investigou a banalidade do mal até sua vida privada, com seus famosos amantes e amigos, incluindo Heidegger, Benjamin, Beauvoir e Sartre. Eis aqui uma Hannah Arendt atemporal, cujo pensamento permanece cada vez mais relevante mesmo meio século depois.', 'https://m.media-amazon.com/images/I/318Uicg4qWS._SX331_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('Animus e Anima: Uma Introdução à Psicologia Analítica sobre os Arquétipos do Masculino e Feminino Inconscientes', 'Psicologia', 'Emma Jung', 'Português', 'Cultrix', 144, 'Atravessamos uma crise aguda, com um questionamento crescente sobre o que é ser homem e o que é ser mulher, sobre desempenho de papéis e funções sociais. Tabus e limites são rompidos todos os dias por alguns segmentos da sociedade, enquanto outros se aferram a padrões totalmente ultrapassados. Nesse crescimento acelerado, torna-se imprescindível que nos reportemos às nossas raízes, a fim de mantermos o eixo da consciência com a natureza. Nestes dois ensaios, apresentados aqui pela primeira vez em um único volume, Emma Jung, esposa de C. G Jung, apresenta em uma síntese brilhante os dois complexos funcionais da psique Anima e Animus, suas formas de manifestação e como atuam em nosso inconsciente. Sua conscientização, diferenciação e desenvolvimento do mundo arquetípico na psique individual são uma exigência imprescindível para o processo de individuação.', 'https://m.media-amazon.com/images/I/41Yd1zYqcBL._SX331_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('Sociedade do cansaço', 'Sociologia', 'Byung-Chul Han', 'Português', 'Vozes', 136, 'Os efeitos colaterais do discurso motivacional, O mercado de palestras e livros motivacionais está crescendo desde o início do século XXI e não mostra sinais de desaquecimento. Religiões tradicionais estão perdendo adeptos para novas igrejas que trocam o discurso do pecado pelo encorajamento e autoajuda. As instituições políticas e empresariais mudaram o sistema de punição, hierarquia e combate ao concorrente pelas positividades do estímulo, eficiência e reconhecimento social pela superação das próprias limitações. Byung-Chul Han mostra que a sociedade disciplinar e repressora do século XX descrita por Michel Foucault perde espaço para uma nova forma de organização coercitiva: a violência neuronal. As pessoas se cobram cada vez mais para apresentar resultados - tornando elas mesmas vigilantes e carrascas de suas ações. Em uma época onde poderíamos trabalhar menos e ganhar mais, a ideologia da positividade opera uma inversão perversa: nos submetemos a trabalhar mais e a receber menos. Essa onda do eu consigo e do yes, we can tem gerado um aumento significativo de doenças como depressão, transtornos de personalidade, síndromes como hiperatividade e burnout. Este livro transcende o campo filosófico e pode ajudar educadores, psicólogos e gestores a entender os novos problemas do século XXI.', 'https://m.media-amazon.com/images/I/411MEkpTzwL._SX289_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('O homem que sabia javanês e outros contos', 'Clássicos da literatura mundial', 'Lima Barreto', 'Português', 'Principis', 112, 'Castelo explica para seu amigo Castro como ingressou na carreira diplomática fingindo saber javanês. Versado em malandragem e desempregado, enganou o Barão de Jacuecanga, se apresentando como um dos raros tradutores do idioma. O homem que sabia javanês e outros contos é um compilado de narrativas que demonstram as características satíricas e realistas de Lima Barreto em suas críticas sociais, com uma linguagem sem floreios que retrata a cultura popular.', 'https://m.media-amazon.com/images/I/51TzPsOdlnL._SX347_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('O Morro dos ventos uivantes', 'Clássicos da literatura mundial', 'Emily Brontë', 'Português', 'Novo Século', 320, 'Um dos clássicos mais importantes e conhecidos do século XIX, este é o único romance publicado da autora Emily Brontë e já foi adaptado diversas vezes para o cinema. Em O Morro dos Ventos Uivantes as personagens são apresentadas na sua forma mais humana: invejosas, rancorosas, imperfeitas. Longe de trazer heróis, o livro é um clássico que aborda sobre a transformação do caráter humano. A obra conta a história da adoção de Heathcliff, órfão, abandonado e desemparado, pelo sr. Earnshaw. O ato de bondade do patriarca da família dá início a um ciclo de amor, ódio, rejeição e vingança.', 'https://m.media-amazon.com/images/I/51EVnP3Q2bL._SX313_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('Algoritmos de Destruição em Massa', 'Sociologia', 'Cathy O Neil', 'Português', 'Rua do Sabão', 342, 'Vivemos na Era do Algoritmo. Cada vez mais, as decisões que afetam nossas vidas ― onde estudamos, se obtemos um empréstimo para comprar um carro, quanto pagamos pelo seguro saúde ― estão sendo tomadas por modelos matemáticos. Em teoria, isso deveria nos conduzir para um mundo mais justo: todos são julgados de acordo com as mesmas regras e o preconceito é eliminado. Mas, como Cathy O Neil revela neste livro urgente e necessário, a verdade é justamente o contrário. Os modelos usados hoje são opacos, não regulamentados e incontestáveis, mesmo quando estão errados. O mais preocupante é que eles reforçam a discriminação: se um estudante pobre não consegue obter um empréstimo porque o modelo matemático o considera muito arriscado (graças ao endereço onde mora), ele também é recusado na universidade que poderia tirá-lo da pobreza. Os algoritmos criam uma espiral discriminatória. Os modelos amparam os privilegiados e punem os oprimidos, criando um coquetel tóxico para a democracia.', 'https://m.media-amazon.com/images/I/41g9qnlUl5L._SX324_BO1,204,203,200_.jpg');
INSERT INTO TB_LIVRO (titulo, genero, autor, idioma, editora, paginas, sinopse_txt, img_url) VALUES ('A máquina do caos: Como as redes sociais reprogramaram nossa mente e nosso mundo', 'Internet e Telecomunicações', 'Max Fisher', 'Português', 'Todavia', 512, 'As redes sociais são provavelmente o maior experimento coletivo da humanidade. Mas qual o impacto delas no mundo? São ferramentas que apenas refletem a natureza das pessoas, ou estimulam comportamentos extremistas? A partir dessas perguntas, o repórter investigativo Max Fisher disseca o funcionamento das grandes empresas de tecnologia, construindo um panorama estarrecedor e dando um alerta para que repensemos com urgência nossa relação com as redes.', 'https://m.media-amazon.com/images/I/51Q-NyP0n5L._SX328_BO1,204,203,200_.jpg');

INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (1, 2, 0);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (1, 3, 1);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (1, 4, 2);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (1, 6, 3);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (1, 7, 4);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (1, 12, 5);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (1, 13, 6);

INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (2, 1, 0);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (2, 5, 1);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (2, 8, 2);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (2, 9, 3);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (2, 10, 4);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (2, 11, 5);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (2, 14, 6);
INSERT INTO TB_PERTENCE (list_id, livro_id, posicao) VALUES (2, 15, 7);
```

