<h1>📄 Formatação de Produtos e Registro</h1>

<p>
  Este projeto em <strong>Java</strong> demonstra como declarar variáveis de diferentes tipos, imprimir mensagens formatadas no console e manipular a formatação de números, inclusive configurando o <em>Locale</em> para o padrão dos EUA.
</p>

<hr>

<h2>📝 O que o código faz?</h2>

<ul>
  <li>Declara dois produtos com nomes e preços (<code>String</code> + <code>double</code>).</li>
  <li>Declara dados pessoais fictícios: idade, código e gênero (<code>int</code> + <code>char</code>).</li>
  <li>Exibe no console:
    <ul>
      <li>Uma lista de produtos e preços com formatação monetária.</li>
      <li>Um registro com idade, código e gênero.</li>
      <li>Um número (<code>measure</code>) exibido com 8 casas decimais, depois arredondado para 3 casas decimais e exibido com ponto decimal no formato americano.</li>
    </ul>
  </li>
</ul>

<hr>

<h2>📋 Tecnologias</h2>

<ul>
  <li>Java SE</li>
  <li><code>System.out.printf()</code> para saída formatada</li>
  <li><code>Locale</code> para configurar o separador decimal</li>
</ul>

<hr>

<h2>🚀 Como executar</h2>

<ol>
  <li>Compile o programa:
    <pre><code>javac Main.java</code></pre>
  </li>
  <li>Execute:
    <pre><code>java Main</code></pre>
  </li>
</ol>

<hr>

<h2>📈 Exemplo de Saída</h2>

<pre>
Products:
Computer, which price is $ 2100.00
Office desk, which price is $ 650.50

Record: 30 years old, code 5290 and gender: F

Measure with eight decimal places: 53.23456700
Rounded (three decimal places): 53.235
US decimal point: 53.235
</pre>

<hr>

<h2>📚 Aprendizados</h2>

<p>
  Este código serve como um exemplo básico de:
</p>

<ul>
  <li>Declaração e inicialização de variáveis em Java.</li>
  <li>Impressão formatada com <code>%s</code>, <code>%d</code> e <code>%f</code>.</li>
  <li>Controle do número de casas decimais em valores numéricos.</li>
  <li>Configuração do <code>Locale</code> para definir o ponto como separador decimal (padrão americano).</li>
</ul>

<hr>

<p><strong>📌 Autor: Breno Diniz Nascimento </strong></p>
