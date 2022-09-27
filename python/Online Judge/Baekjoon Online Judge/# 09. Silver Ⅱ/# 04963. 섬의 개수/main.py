from sys import stdin, stdout, setrecursionlimit

setrecursionlimit(2500)
input = lambda: stdin.readline().rstrip()
print = stdout.write

DIRECTION = [
    (1, 0), (1, 1), (0, 1), (-1, 1), (-1, 0), (-1, -1), (0, -1), (1, -1)
]

def main():
    while True:
        w, h = map(int, input().split())

        if w == h == 0:
            break

        graph = [[number for number in map(int, input().split())] for _ in range(h)]
        count = 0
        for y in range(h):
            for x in range(w):
                if graph[y][x] == 1:  # 땅을 찾으면, 땅을 방문처리
                    graph[y][x] == 0
                    count += 1
                    dfs(graph, w, h, x, y)  # 연결된 육지들을 전부 방문처리한다.
        print(str(count))
        print('\n')


def dfs(graph, w, h, x, y):
    for (dx, dy) in DIRECTION:
        nx = x + dx
        ny = y + dy

        if (0 <= nx <= w - 1) and (0 <= ny <= h - 1) and graph[ny][nx] == 1:
            graph[ny][nx] = 0
            dfs(graph, w, h, nx, ny)


main()
