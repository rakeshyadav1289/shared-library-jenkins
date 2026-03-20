def call(string url, string branch)
{
  echo "git clonning"
  git branch: "${branch}" , url: "${url}"
  echo 'git cloning successfull'
}
