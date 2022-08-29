<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>坂散歩|坂道情報サイト</title>
<meta name="description" content="坂の事がよくわかる、もっと好きになれる坂道情報サイト">
<link rel="stylesheet" href="https://unpkg.com/ress/dist/ress.min.css">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<header>
  <div class="center-container">
    <div class="flex-container">
      <h1><a href="">坂散歩</a></h1>
      <nav>
        <ul class="flex-container">
          <li><a href="">Home</a></li>
          <li class="current"><a href="form">会員登録・ログイン</a>
          <li><a href="">お問い合わせ</a></li>
        </ul>
      </nav>
    </div><!-- /.flex-container -->
    <div class="hero">
      <h2></h2>
    </div>
  </div><!-- /.center-container -->
</header>
<main class="main">
  <div class="center-container flex-container">
    <aside class="saka-nav">
      <ul>
        <li><a href="#list">坂道一覧</a></li>
        <li><a href="#register">坂道登録</a></li>
      </ul>
    </aside>
    <div class="section-group">
      <section>
        <h3 id="list">色々な坂道</h3>
        <ul class="flex-container">
          <li>
            <img src="img/gongen.jpg">
            <p class="caption">権現坂</p>
          </li>
          <li>
            <img src="img/ojiinari.jpg">
            <p class="caption">王子稲荷坂</p>
          </li>
          <li>
            <img src="img/ojiosaka.jpg">
            <p class="caption">王子大坂</p>
          </li>
        </ul>
      </section><!-- /.list -->
    </div><!-- /.section-group -->
  </div><!-- /.center-container /.flex-container-->
</main>
<footer>
  <div>
    <p>Copyright &copy; 2022 坂散歩.</p>
  </div>
</footer>
</body>
</html>