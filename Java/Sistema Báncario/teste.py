import math # Ativa o módulo de funções matemáticas
""" Gera a sequência de Fibonacci até ultrapassar um limite
    que deve ser menor do que 1000, para alinhar os resultados
    e razão entre cada dois elementos """
# O limite deve ser maior ou igual a 2
Limite=int(input('Entre com o limite (>= 2): '))
N=2 # Número de ordem de cada elemento da sequência
FibA = 1
FibB = 1
# Imprime os títulos da tabela
print(' N      Fib(N)          Razão')
# Imprime os dois primeiros
print ('001     001')
print ('002     001     1.0')
while FibB < Limite:
  Aux = FibA + FibB # Cada novo elemento será a soma dos dois anteriores
  FibA=FibB # O segundo elemento torna-se o primeiro
  FibB=Aux  # O segundo elemento recebe a soma dos dois anteriores
  N=N+1     # Número de ordem do próximo elemento
  # Concatena 00 à esquerda se Fib(N) for menor do que 10
  #   e um 0 se for maior do que 9 e menor do que 100
  print('00'+str(N) if N<10 else '0'+str(N) if N<100 else N,
      '   ', '00'+str(FibB) if FibB<10 else
      '0'+str(FibB) if FibB<100 else FibB,'   ', FibB/FibA)
  print('Compare com a razão áurea:\n','            ',(1+math.sqrt(5))/2)