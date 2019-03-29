#-*- coding: utf-8 -*-

class Node:
    def __init__(self, data, next = None):
        self.data = data
        self.next = next

def make_node():

    node1 = Node(1)
    node2 = Node(2)
    node3 = Node(3)
    node4 = Node(4)

    node1.next = node2
    node2.next = node3
    node3.next = node4

    return node1


def main():
    make_node()
    node = node1
    while node:
        print(node.data)
        node = node.next


if __name__ == "__main__":
    main()
